package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class y42 implements tg0 {
    private static qy2 b(String str) {
        char c7;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c7 = 0;
            }
            c7 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c7 = 1;
            }
            c7 = 65535;
        } else {
            if (str.equals("video")) {
                c7 = 2;
            }
            c7 = 65535;
        }
        if (c7 == 0) {
            return qy2.HTML_DISPLAY;
        }
        if (c7 == 1) {
            return qy2.NATIVE_DISPLAY;
        }
        if (c7 != 2) {
            return null;
        }
        return qy2.VIDEO;
    }

    private static sy2 c(String str) {
        char c7;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c7 = 0;
            }
            c7 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c7 = 2;
            }
            c7 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c7 = 1;
            }
            c7 = 65535;
        }
        return c7 != 0 ? c7 != 1 ? c7 != 2 ? sy2.UNSPECIFIED : sy2.ONE_PIXEL : sy2.DEFINED_BY_JAVASCRIPT : sy2.BEGIN_TO_RENDER;
    }

    private static ty2 d(String str) {
        return "native".equals(str) ? ty2.NATIVE : "javascript".equals(str) ? ty2.JAVASCRIPT : ty2.NONE;
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final String a(Context context) {
        if (((Boolean) sw.c().b(m10.B3)).booleanValue()) {
            return "a.1.3.3-google_20200416";
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void g0(x3.a aVar) {
        if (((Boolean) sw.c().b(m10.B3)).booleanValue() && iy2.b()) {
            Object O0 = x3.b.O0(aVar);
            if (O0 instanceof ly2) {
                ((ly2) O0).e();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void h0(x3.a aVar, View view) {
        if (((Boolean) sw.c().b(m10.B3)).booleanValue() && iy2.b()) {
            Object O0 = x3.b.O0(aVar);
            if (O0 instanceof ly2) {
                ((ly2) O0).b(view, ry2.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final x3.a i0(String str, WebView webView, String str2, String str3, String str4, vg0 vg0Var, ug0 ug0Var, String str5) {
        String valueOf;
        String str6;
        String str7;
        if (!((Boolean) sw.c().b(m10.B3)).booleanValue() || !iy2.b()) {
            return null;
        }
        uy2 a7 = uy2.a("Google", str);
        ty2 d7 = d("javascript");
        qy2 b7 = b(ug0Var.toString());
        ty2 ty2Var = ty2.NONE;
        if (d7 == ty2Var) {
            str7 = "Omid html session error; Unable to parse impression owner: javascript";
        } else {
            if (b7 == null) {
                valueOf = String.valueOf(ug0Var);
                str6 = "Omid html session error; Unable to parse creative type: ";
            } else {
                ty2 d8 = d(str4);
                if (b7 != qy2.VIDEO || d8 != ty2Var) {
                    return x3.b.B3(ly2.a(my2.a(b7, c(vg0Var.toString()), d7, d8, true), ny2.b(a7, webView, str5, "")));
                }
                valueOf = String.valueOf(str4);
                str6 = "Omid html session error; Video events owner unknown for video creative: ";
                if (valueOf.length() == 0) {
                    str7 = new String("Omid html session error; Video events owner unknown for video creative: ");
                }
            }
            str7 = str6.concat(valueOf);
        }
        io0.g(str7);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final x3.a j0(String str, WebView webView, String str2, String str3, String str4, String str5, vg0 vg0Var, ug0 ug0Var, String str6) {
        String concat;
        if (!((Boolean) sw.c().b(m10.B3)).booleanValue() || !iy2.b()) {
            return null;
        }
        uy2 a7 = uy2.a(str5, str);
        ty2 d7 = d("javascript");
        ty2 d8 = d(str4);
        qy2 b7 = b(ug0Var.toString());
        ty2 ty2Var = ty2.NONE;
        if (d7 == ty2Var) {
            concat = "Omid js session error; Unable to parse impression owner: javascript";
        } else {
            if (b7 != null) {
                if (b7 != qy2.VIDEO || d8 != ty2Var) {
                    return x3.b.B3(ly2.a(my2.a(b7, c(vg0Var.toString()), d7, d8, true), ny2.c(a7, webView, str6, "")));
                }
                String valueOf = String.valueOf(str4);
                io0.g(valueOf.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(valueOf) : new String("Omid js session error; Video events owner unknown for video creative: "));
                return null;
            }
            concat = "Omid js session error; Unable to parse creative type: ".concat(String.valueOf(ug0Var));
        }
        io0.g(concat);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final boolean k0(Context context) {
        if (!((Boolean) sw.c().b(m10.B3)).booleanValue()) {
            io0.g("Omid flag is disabled");
            return false;
        }
        if (iy2.b()) {
            return true;
        }
        iy2.a(context);
        return iy2.b();
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void l0(x3.a aVar, View view) {
        if (((Boolean) sw.c().b(m10.B3)).booleanValue() && iy2.b()) {
            Object O0 = x3.b.O0(aVar);
            if (O0 instanceof ly2) {
                ((ly2) O0).d(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void zze(x3.a aVar) {
        if (((Boolean) sw.c().b(m10.B3)).booleanValue() && iy2.b()) {
            Object O0 = x3.b.O0(aVar);
            if (O0 instanceof ly2) {
                ((ly2) O0).c();
            }
        }
    }
}
