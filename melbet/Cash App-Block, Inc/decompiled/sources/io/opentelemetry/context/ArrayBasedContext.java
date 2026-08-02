package io.opentelemetry.context;

import io.noties.markwon.LinkResolverDef;
import io.opentelemetry.api.trace.PropagatedSpan;
import io.opentelemetry.api.trace.SpanContextKey;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class ArrayBasedContext implements Context {
    public static final ArrayBasedContext ROOT = new ArrayBasedContext(new Object[0]);
    public final Object[] entries;

    public ArrayBasedContext(Object[] objArr) {
        this.entries = objArr;
    }

    @Override // io.opentelemetry.context.Context
    public final Object get() {
        int i = 0;
        while (true) {
            Object[] objArr = this.entries;
            if (i >= objArr.length) {
                return null;
            }
            if (objArr[i] == SpanContextKey.KEY) {
                return objArr[i + 1];
            }
            i += 2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.entries;
            if (i >= objArr.length) {
                break;
            }
            sb.append(objArr[i]);
            sb.append('=');
            sb.append(objArr[i + 1]);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // io.opentelemetry.context.Context
    public final Context with(PropagatedSpan propagatedSpan) {
        int i = 0;
        while (true) {
            Object[] objArr = this.entries;
            int length = objArr.length;
            LinkResolverDef linkResolverDef = SpanContextKey.KEY;
            if (i >= length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = linkResolverDef;
                copyOf[copyOf.length - 1] = propagatedSpan;
                return new ArrayBasedContext(copyOf);
            }
            if (objArr[i] == linkResolverDef) {
                int i2 = i + 1;
                if (objArr[i2] == propagatedSpan) {
                    return this;
                }
                Object[] objArr2 = (Object[]) objArr.clone();
                objArr2[i2] = propagatedSpan;
                return new ArrayBasedContext(objArr2);
            }
            i += 2;
        }
    }
}
