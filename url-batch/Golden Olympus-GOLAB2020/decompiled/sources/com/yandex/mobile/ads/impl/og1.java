package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.uu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class og1 extends jy1 {

    /* renamed from: m, reason: collision with root package name */
    private final sf1 f30023m = new sf1();

    /* renamed from: n, reason: collision with root package name */
    private final sf1 f30024n = new sf1();

    /* renamed from: o, reason: collision with root package name */
    private final a f30025o = new a();

    /* renamed from: p, reason: collision with root package name */
    private Inflater f30026p;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final sf1 f30027a = new sf1();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f30028b = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];

        /* renamed from: c, reason: collision with root package name */
        private boolean f30029c;

        /* renamed from: d, reason: collision with root package name */
        private int f30030d;

        /* renamed from: e, reason: collision with root package name */
        private int f30031e;

        /* renamed from: f, reason: collision with root package name */
        private int f30032f;

        /* renamed from: g, reason: collision with root package name */
        private int f30033g;

        /* renamed from: h, reason: collision with root package name */
        private int f30034h;

        /* renamed from: i, reason: collision with root package name */
        private int f30035i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.jy1
    protected final c32 a(byte[] bArr, int i4, boolean z4) {
        ArrayList arrayList;
        int i5;
        uu uuVar;
        int i6;
        int w4;
        int i7 = 4;
        int i8 = UserVerificationMethods.USER_VERIFY_PATTERN;
        this.f30023m.a(i4, bArr);
        sf1 sf1Var = this.f30023m;
        if (sf1Var.a() > 0 && sf1Var.g() == 120) {
            if (this.f30026p == null) {
                this.f30026p = new Inflater();
            }
            if (u82.a(sf1Var, this.f30024n, this.f30026p)) {
                sf1Var.a(this.f30024n.e(), this.f30024n.c());
            }
        }
        a aVar = this.f30025o;
        aVar.f30030d = 0;
        aVar.f30031e = 0;
        aVar.f30032f = 0;
        aVar.f30033g = 0;
        aVar.f30034h = 0;
        aVar.f30035i = 0;
        aVar.f30027a.c(0);
        aVar.f30029c = false;
        ArrayList arrayList2 = new ArrayList();
        while (this.f30023m.a() >= 3) {
            sf1 sf1Var2 = this.f30023m;
            a aVar2 = this.f30025o;
            int e4 = sf1Var2.e();
            int t4 = sf1Var2.t();
            int z5 = sf1Var2.z();
            int d4 = sf1Var2.d() + z5;
            if (d4 > e4) {
                sf1Var2.e(e4);
                i5 = i8;
                arrayList = arrayList2;
                uuVar = null;
            } else {
                if (t4 != i8) {
                    switch (t4) {
                        case 20:
                            aVar2.getClass();
                            if (z5 % 5 == 2) {
                                sf1Var2.f(2);
                                Arrays.fill(aVar2.f30028b, 0);
                                int i9 = z5 / 5;
                                int i10 = 0;
                                while (i10 < i9) {
                                    int t5 = sf1Var2.t();
                                    int t6 = sf1Var2.t();
                                    int t7 = sf1Var2.t();
                                    int t8 = sf1Var2.t();
                                    int t9 = sf1Var2.t();
                                    double d5 = t6;
                                    int i11 = i8;
                                    double d6 = t7 - 128;
                                    int i12 = (int) ((1.402d * d6) + d5);
                                    double d7 = t8 - 128;
                                    int i13 = (int) ((d5 - (0.34414d * d7)) - (d6 * 0.71414d));
                                    int i14 = (int) ((d7 * 1.772d) + d5);
                                    int[] iArr = aVar2.f30028b;
                                    int i15 = u82.f32873a;
                                    iArr[t5] = (Math.max(0, Math.min(i13, KotlinVersion.MAX_COMPONENT_VALUE)) << 8) | (Math.max(0, Math.min(i12, KotlinVersion.MAX_COMPONENT_VALUE)) << 16) | (t9 << 24) | Math.max(0, Math.min(i14, KotlinVersion.MAX_COMPONENT_VALUE));
                                    i10++;
                                    i9 = i9;
                                    i8 = i11;
                                    arrayList2 = arrayList2;
                                }
                                i6 = i8;
                                arrayList = arrayList2;
                                aVar2.f30029c = true;
                                break;
                            }
                            i6 = i8;
                            arrayList = arrayList2;
                            break;
                        case 21:
                            aVar2.getClass();
                            if (z5 >= i7) {
                                sf1Var2.f(3);
                                int i16 = z5 - 4;
                                if ((sf1Var2.t() & i8) != 0) {
                                    if (i16 >= 7 && (w4 = sf1Var2.w()) >= i7) {
                                        aVar2.f30034h = sf1Var2.z();
                                        aVar2.f30035i = sf1Var2.z();
                                        aVar2.f30027a.c(w4 - i7);
                                        i16 = z5 - 11;
                                    }
                                }
                                int d8 = aVar2.f30027a.d();
                                int e5 = aVar2.f30027a.e();
                                if (d8 < e5 && i16 > 0) {
                                    int min = Math.min(i16, e5 - d8);
                                    sf1Var2.a(aVar2.f30027a.c(), d8, min);
                                    aVar2.f30027a.e(d8 + min);
                                }
                            }
                            i6 = i8;
                            arrayList = arrayList2;
                            break;
                        case 22:
                            aVar2.getClass();
                            if (z5 >= 19) {
                                aVar2.f30030d = sf1Var2.z();
                                aVar2.f30031e = sf1Var2.z();
                                sf1Var2.f(11);
                                aVar2.f30032f = sf1Var2.z();
                                aVar2.f30033g = sf1Var2.z();
                            }
                            i6 = i8;
                            arrayList = arrayList2;
                            break;
                        default:
                            i6 = i8;
                            arrayList = arrayList2;
                            break;
                    }
                    i5 = i6;
                    uuVar = null;
                } else {
                    int i17 = i8;
                    arrayList = arrayList2;
                    if (aVar2.f30030d == 0 || aVar2.f30031e == 0 || aVar2.f30034h == 0 || aVar2.f30035i == 0 || aVar2.f30027a.e() == 0 || aVar2.f30027a.d() != aVar2.f30027a.e() || !aVar2.f30029c) {
                        i5 = i17;
                        uuVar = null;
                    } else {
                        aVar2.f30027a.e(0);
                        int i18 = aVar2.f30034h * aVar2.f30035i;
                        int[] iArr2 = new int[i18];
                        int i19 = 0;
                        while (i19 < i18) {
                            int t10 = aVar2.f30027a.t();
                            if (t10 != 0) {
                                iArr2[i19] = aVar2.f30028b[t10];
                                i19++;
                            } else {
                                int t11 = aVar2.f30027a.t();
                                if (t11 != 0) {
                                    int i20 = i17;
                                    int t12 = ((t11 & 64) == 0 ? t11 & 63 : ((t11 & 63) << 8) | aVar2.f30027a.t()) + i19;
                                    Arrays.fill(iArr2, i19, t12, (t11 & i20) == 0 ? 0 : aVar2.f30028b[aVar2.f30027a.t()]);
                                    i19 = t12;
                                    i17 = i20;
                                }
                            }
                        }
                        i5 = i17;
                        uuVar = new uu.a().a(Bitmap.createBitmap(iArr2, aVar2.f30034h, aVar2.f30035i, Bitmap.Config.ARGB_8888)).b(aVar2.f30032f / aVar2.f30030d).b(0).a(0, aVar2.f30033g / aVar2.f30031e).a(0).d(aVar2.f30034h / aVar2.f30030d).a(aVar2.f30035i / aVar2.f30031e).a();
                    }
                    aVar2.f30030d = 0;
                    aVar2.f30031e = 0;
                    aVar2.f30032f = 0;
                    aVar2.f30033g = 0;
                    aVar2.f30034h = 0;
                    aVar2.f30035i = 0;
                    aVar2.f30027a.c(0);
                    aVar2.f30029c = false;
                }
                sf1Var2.e(d4);
            }
            if (uuVar != null) {
                ArrayList arrayList3 = arrayList;
                arrayList3.add(uuVar);
                arrayList2 = arrayList3;
            } else {
                arrayList2 = arrayList;
            }
            i8 = i5;
            i7 = 4;
        }
        return new pg1(Collections.unmodifiableList(arrayList2));
    }
}
