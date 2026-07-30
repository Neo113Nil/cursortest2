package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class Jz {

    /* renamed from: a, reason: collision with root package name */
    public final File f25857a;

    /* renamed from: b, reason: collision with root package name */
    public final File f25858b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f25859c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3901sN f25860d;

    /* renamed from: e, reason: collision with root package name */
    public final C4158xA f25861e;

    public Jz(Context context, SharedPreferences sharedPreferences, InterfaceC3901sN interfaceC3901sN, C4158xA c4158xA) {
        this.f25859c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        AbstractC2720Pd.E(dir, false);
        this.f25857a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        AbstractC2720Pd.E(dir2, true);
        this.f25858b = dir2;
        this.f25860d = interfaceC3901sN;
        this.f25861e = c4158xA;
    }

    public final void a(My my, byte[] bArr, byte[] bArr2) {
        String A8 = my.A().A();
        boolean isEmpty = TextUtils.isEmpty(A8);
        C4158xA c4158xA = this.f25861e;
        if (!isEmpty && bArr2.length != 0) {
            File file = this.f25858b;
            AbstractC2720Pd.K(file);
            file.mkdirs();
            File x3 = AbstractC2720Pd.x(A8, file);
            x3.getClass();
            x3.mkdirs();
            File c4 = AbstractC2720Pd.c(A8, "pcam.jar", file);
            c4.getClass();
            if (bArr == null || bArr.length <= 0 || AbstractC2720Pd.t(c4, bArr)) {
                File c9 = AbstractC2720Pd.c(A8, "pcbc", file);
                c9.getClass();
                if (AbstractC2720Pd.t(c9, bArr2)) {
                    String A9 = my.A().A();
                    if (!TextUtils.isEmpty(A9)) {
                        File c10 = AbstractC2720Pd.c(A9, "pcam.jar", file);
                        c10.getClass();
                        File c11 = AbstractC2720Pd.c(A9, "pcbc", file);
                        c11.getClass();
                        File c12 = AbstractC2720Pd.c(A9, "pcam.jar", c());
                        c12.getClass();
                        File c13 = AbstractC2720Pd.c(A9, "pcbc", c());
                        c13.getClass();
                        if (c10.exists() && !c10.renameTo(c12)) {
                            c4158xA.b(15318);
                        } else if (c11.exists() && c11.renameTo(c13)) {
                            My b9 = b(1);
                            SharedPreferences.Editor edit = this.f25859c.edit();
                            if (b9 != null && !my.A().A().equals(b9.A().A())) {
                                edit.putString(d(), S2.b.b(b9.b()));
                            }
                            edit.putString(e(), S2.b.b(my.b()));
                            if (!edit.commit()) {
                                c4158xA.b(15320);
                            }
                        } else {
                            c4158xA.b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    My b10 = b(1);
                    if (b10 != null) {
                        hashSet.add(b10.A().A());
                    }
                    My b11 = b(2);
                    if (b11 != null) {
                        hashSet.add(b11.A().A());
                    }
                    File[] listFiles = c().listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File x9 = AbstractC2720Pd.x(name, c());
                                x9.getClass();
                                AbstractC2720Pd.K(x9);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        c4158xA.b(15316);
    }

    public final My b(int i) {
        SharedPreferences sharedPreferences = this.f25859c;
        String string = i == 1 ? sharedPreferences.getString(e(), null) : sharedPreferences.getString(d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] j9 = S2.b.j(string);
                My E8 = My.E(SK.s(j9, 0, j9.length));
                String A8 = E8.A().A();
                File c4 = AbstractC2720Pd.c(A8, "pcam.jar", c());
                if (c4 == null) {
                    throw null;
                }
                if (!c4.exists() && (c4 = AbstractC2720Pd.c(A8, "pcam", c())) == null) {
                    throw null;
                }
                File c9 = AbstractC2720Pd.c(A8, "pcbc", c());
                if (c9 == null) {
                    throw null;
                }
                if (c4.exists() && c9.exists()) {
                    return E8;
                }
            } catch (C3845rL unused) {
                this.f25861e.b(15317);
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.f25857a, Integer.toString(((X7) this.f25860d.d()).f28615n));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i = ((X7) this.f25860d.d()).f28615n;
        return D.y.j(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public final String e() {
        int i = ((X7) this.f25860d.d()).f28615n;
        return D.y.j(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }
}
