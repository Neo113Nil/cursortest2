package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ac1 extends cc1 {
    public final Class XL4ISE6Oc65B;

    public ac1(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.XL4ISE6Oc65B = cls;
        } else {
            u9.a92UlCVFR9N8(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.cc1, defpackage.dc1
    public final String lS5Rgt96tfkO() {
        return this.XL4ISE6Oc65B.getName();
    }

    @Override // defpackage.cc1, defpackage.dc1
    /* renamed from: rtx2ld2ELZv4, reason: merged with bridge method [inline-methods] */
    public final Enum Y1f8riQaR6yg(String str) {
        Object obj;
        Class cls = this.XL4ISE6Oc65B;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (pa2.xbgXKYA2cIfu(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r3 = (Enum) obj;
        if (r3 != null) {
            return r3;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + '.');
    }
}
