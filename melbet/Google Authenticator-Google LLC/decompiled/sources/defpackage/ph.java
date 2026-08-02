package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.android.apps.authenticator2.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ph implements afd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ph(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.afd
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                pw pwVar = (pw) obj;
                if (pwVar != null) {
                    int i = pwVar.a;
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        case 15:
                        case 20:
                        case 22:
                            break;
                        case 6:
                        case 16:
                        case 17:
                        case 19:
                        default:
                            i = 8;
                            break;
                        case 18:
                        case 21:
                            i = 1;
                            break;
                    }
                    Object obj2 = this.a;
                    bd bdVar = (bd) obj2;
                    Context x = bdVar.x();
                    if (Build.VERSION.SDK_INT < 29) {
                        if (i != 7) {
                            if (i == 9) {
                                i = 9;
                            }
                        }
                        if (x != null && oy.i(x)) {
                            pn pnVar = (pn) obj2;
                            if (pj.c(pnVar.a.n)) {
                                pnVar.n();
                                ((pn) obj2).a.h(null);
                                break;
                            }
                        }
                    }
                    int i2 = i;
                    CharSequence charSequence = pwVar.b;
                    pn pnVar2 = (pn) obj2;
                    if (pnVar2.aH()) {
                        if (charSequence == null) {
                            charSequence = ox.d(bdVar.x(), i2);
                        }
                        CharSequence charSequence2 = charSequence;
                        if (i2 == 5) {
                            int i3 = pnVar2.a.f;
                            if (i3 == 0 || i3 == 3) {
                                pnVar2.p(5, charSequence2);
                            }
                            pnVar2.d();
                        } else {
                            if (pnVar2.a.u) {
                                pnVar2.o(i2, charSequence2);
                            } else {
                                pnVar2.q(charSequence2);
                                Handler handler = pnVar2.b;
                                mr mrVar = new mr(obj2, i2, charSequence2, 5, null);
                                Context x2 = bdVar.x();
                                handler.postDelayed(mrVar, (x2 == null || !ox.g(x2, Build.MODEL)) ? 2000 : 0);
                            }
                            pnVar2.a.u = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = bdVar.R(R.string.default_error_msg) + " " + i2;
                        }
                        pnVar2.o(i2, charSequence);
                    }
                    ((pn) obj2).a.h(null);
                }
                break;
            case 1:
                bsh bshVar = (bsh) obj;
                if (bshVar != null) {
                    pn pnVar3 = (pn) this.a;
                    pnVar3.aI(bshVar);
                    pnVar3.a.r(null);
                    break;
                }
                break;
            case 2:
                CharSequence charSequence3 = (CharSequence) obj;
                if (charSequence3 != null) {
                    pn pnVar4 = (pn) this.a;
                    if (pnVar4.aH()) {
                        pnVar4.q(charSequence3);
                    }
                    pnVar4.a.h(null);
                    break;
                }
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    Object obj3 = this.a;
                    pn pnVar5 = (pn) obj3;
                    if (pnVar5.aH()) {
                        pnVar5.q(((bd) obj3).R(R.string.fingerprint_not_recognized));
                    }
                    if (pnVar5.a.h) {
                        new pl(2, (char[]) null).execute(new nc(obj3, 4));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    pnVar5.a.i(false);
                    break;
                }
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    Object obj4 = this.a;
                    pn pnVar6 = (pn) obj4;
                    if (pnVar6.aG()) {
                        pnVar6.n();
                    } else {
                        CharSequence e = pnVar6.a.e();
                        if (e == null) {
                            e = ((bd) obj4).R(R.string.default_error_msg);
                        }
                        pnVar6.o(13, e);
                        pnVar6.a(2);
                    }
                    pnVar6.a.n(false);
                    break;
                }
                break;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    Object obj5 = this.a;
                    String R = ((bd) obj5).R(R.string.content_view_more_options_button_clicked);
                    pn pnVar7 = (pn) obj5;
                    pnVar7.o(22, R);
                    pnVar7.a(4);
                    pnVar7.a.m(false);
                    break;
                }
                break;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    pn pnVar8 = (pn) this.a;
                    pnVar8.a(1);
                    pnVar8.d();
                    pnVar8.a.j(false);
                    break;
                }
                break;
            case 7:
                ((gzp) obj).getClass();
                fao.e(new dlj(this.a, 17));
                break;
            case 8:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ecb ecbVar = (ecb) this.a;
                ecbVar.b = booleanValue;
                ecbVar.a(ecbVar.c);
                break;
            default:
                fao.e(new dlj(this.a, 19));
                break;
        }
    }
}
