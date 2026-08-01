package kotlin;

import a4.j;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0019\bF\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\r\u001a\u00020\u000eH\u0096\u0080\u0004J\u000f\u0010\u000f\u001a\u00028\u0000HÆ\u0083\u0004¢\u0006\u0002\u0010\nJ\u000f\u0010\u0010\u001a\u00028\u0001HÆ\u0083\u0004¢\u0006\u0002\u0010\nJ/\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0081\u0004¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0017\u0010\u0005\u001a\u00028\u0000X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00028\u0001X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0007\u0010\u0002¨\u0006\u0019"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "toString", "", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "equals", "", "other", "", "hashCode", "", "kotlin-stdlib", "Lkotlin/js/JsImplicitExport;", "couldBeConvertedToExplicitExport"}, k = 1, mv = {2, j.LONG_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Pair<A, B> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f5552d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5553e;

    public Pair(Object obj, Object obj2) {
        this.f5552d = obj;
        this.f5553e = obj2;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) other;
        return Intrinsics.a(this.f5552d, pair.f5552d) && Intrinsics.a(this.f5553e, pair.f5553e);
    }

    public final int hashCode() {
        Object obj = this.f5552d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f5553e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f5552d + ", " + this.f5553e + ')';
    }
}
