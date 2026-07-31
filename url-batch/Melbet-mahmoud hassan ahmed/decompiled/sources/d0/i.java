package d0;

/* loaded from: classes.dex */
public abstract class i {

    class a extends i {
        a() {
        }

        @Override // d0.i
        public h a(String str) {
            return null;
        }
    }

    public static i c() {
        return new a();
    }

    public abstract h a(String str);

    public final h b(String str) {
        h a7 = a(str);
        return a7 == null ? h.a(str) : a7;
    }
}
