package j8;

import b8.d;
import b8.g;
import b8.i;
import b8.s;
import c6.f;
import java.util.Arrays;
import s7.d2;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f5105a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f5106b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f5107c;

    static {
        int i3 = i.f1427i;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        i.m(15, objArr);
        d dVar = g.f1423e;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        w.j(7, objArr2);
        f5105a = g.k(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        w.j(3, objArr3);
        f5106b = g.k(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        w.j(2, objArr4);
        f5107c = g.k(2, objArr4);
        f.n(4, "initialCapacity");
        Object[] objArr5 = new Object[4];
        String[] strArr = d2.f8589l;
        w.j(15, strArr);
        int i10 = 0 + 15;
        if (objArr5.length < i10) {
            objArr5 = Arrays.copyOf(objArr5, b8.a.b(objArr5.length, i10));
        }
        System.arraycopy(strArr, 0, objArr5, 0, 15);
        int i11 = 0 + 15;
        String[] strArr2 = d2.f8590m;
        w.j(15, strArr2);
        int i12 = i11 + 15;
        if (objArr5.length < i12) {
            objArr5 = Arrays.copyOf(objArr5, b8.a.b(objArr5.length, i12));
        }
        System.arraycopy(strArr2, 0, objArr5, i11, 15);
        g.k(i11 + 15, objArr5);
        Object[] objArr6 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        w.j(2, objArr6);
        g.k(2, objArr6);
    }
}
