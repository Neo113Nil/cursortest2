package y2;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* renamed from: y2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1341p<T> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f11673d = new a(null);

    @Metadata
    /* renamed from: y2.p$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof C1342q) {
            return ((C1342q) obj).f11674d;
        }
        return null;
    }

    public static final boolean b(Serializable serializable) {
        return serializable instanceof C1342q;
    }
}
