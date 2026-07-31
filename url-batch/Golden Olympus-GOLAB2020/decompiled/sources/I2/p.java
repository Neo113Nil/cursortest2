package I2;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private String f789a;

    /* renamed from: b, reason: collision with root package name */
    private int f790b = 0;

    public p(String str) {
        this.f789a = str;
    }

    public boolean a() {
        return this.f790b != -1;
    }

    public String b() {
        int i4 = this.f790b;
        if (i4 == -1) {
            return null;
        }
        int indexOf = this.f789a.indexOf(46, i4);
        if (indexOf == -1) {
            String substring = this.f789a.substring(this.f790b);
            this.f790b = -1;
            return substring;
        }
        String substring2 = this.f789a.substring(this.f790b, indexOf);
        this.f790b = indexOf + 1;
        return substring2;
    }
}
