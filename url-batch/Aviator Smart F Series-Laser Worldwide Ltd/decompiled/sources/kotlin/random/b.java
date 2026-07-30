package kotlin.random;

import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends kotlin.random.a {
    private final a implStorage = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    }

    @Override // kotlin.random.a
    public java.util.Random getImpl() {
        Object obj = this.implStorage.get();
        s.checkNotNullExpressionValue(obj, "implStorage.get()");
        return (java.util.Random) obj;
    }
}
