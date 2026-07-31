package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class mp {

    /* renamed from: a, reason: collision with root package name */
    private final bp f8662a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8663b;

    /* renamed from: c, reason: collision with root package name */
    private String f8664c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8665d;

    public mp(int i7, int i8, int i9) {
        this.f8663b = i7;
        i8 = (i8 > 64 || i8 < 0) ? 64 : i8;
        if (i9 <= 0) {
            this.f8665d = 1;
        } else {
            this.f8665d = i9;
        }
        this.f8662a = new kp(i8);
    }

    public final String a(ArrayList<String> arrayList, ArrayList<ap> arrayList2) {
        Collections.sort(arrayList2, new lp(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            String[] split = Normalizer.normalize(arrayList.get(arrayList2.get(i7).e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i8 = 1;
                        boolean z6 = false;
                        while (true) {
                            int i9 = i8 + 2;
                            if (i9 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i8) == '\'') {
                                if (sb.charAt(i8 - 1) != ' ') {
                                    int i10 = i8 + 1;
                                    if ((sb.charAt(i10) == 's' || sb.charAt(i10) == 'S') && (i9 == sb.length() || sb.charAt(i9) == ' ')) {
                                        sb.insert(i8, ' ');
                                        i8 = i9;
                                        z6 = true;
                                    }
                                }
                                sb.setCharAt(i8, ' ');
                                z6 = true;
                            }
                            i8++;
                        }
                        String sb2 = z6 ? sb.toString() : null;
                        if (sb2 != null) {
                            this.f8664c = sb2;
                            str = sb2;
                        }
                    }
                    String[] b7 = fp.b(str, true);
                    if (b7.length >= this.f8665d) {
                        for (int i11 = 0; i11 < b7.length; i11++) {
                            String str2 = "";
                            for (int i12 = 0; i12 < this.f8665d; i12++) {
                                int i13 = i11 + i12;
                                if (i13 >= b7.length) {
                                    break;
                                }
                                if (i12 > 0) {
                                    str2 = String.valueOf(str2).concat(" ");
                                }
                                String valueOf = String.valueOf(str2);
                                String valueOf2 = String.valueOf(b7[i13]);
                                str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.f8663b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f8663b) {
                            break loop0;
                        }
                    }
                }
            }
        }
        dp dpVar = new dp();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                dpVar.f4267b.write(this.f8662a.b((String) it.next()));
            } catch (IOException e7) {
                io0.e("Error while writing hash to byteStream", e7);
            }
        }
        return dpVar.toString();
    }
}
