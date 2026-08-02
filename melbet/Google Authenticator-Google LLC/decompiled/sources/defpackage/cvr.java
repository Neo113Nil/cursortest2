package defpackage;

import java.util.WeakHashMap;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cvr implements gzf {
    private final /* synthetic */ int a;

    public /* synthetic */ cvr(int i) {
        this.a = i;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        ddi w;
        ddi w2;
        ddi w3;
        ddi w4;
        ddi w5;
        ddi w6;
        ddi w7;
        ddi w8;
        switch (this.a) {
            case 0:
                cvs cvsVar = cvw.a;
                w = dih.w(true);
                break;
            case 1:
                boolean z = ((cld) obj).a;
                WeakHashMap weakHashMap = cku.b;
                break;
            case 2:
                cvs cvsVar2 = cvw.a;
                w2 = dih.w(true);
                break;
            case 3:
                cwd cwdVar = cwe.a;
                w3 = dih.w(true);
                break;
            case 4:
                cwd cwdVar2 = cwe.a;
                w4 = dih.w(true);
                break;
            case 5:
                cwh cwhVar = cwi.a;
                w5 = dih.w(true);
                break;
            case 6:
                cwh cwhVar2 = cwi.a;
                w6 = dih.w(true);
                break;
            case 7:
                cwr cwrVar = cww.k;
                w7 = dih.w(true);
                break;
            case 8:
                cwr cwrVar2 = cww.k;
                w8 = dih.w(true);
                break;
            case 9:
                dfe dfeVar = (dfe) obj;
                dfeVar.getClass();
                dfg dfgVar = dfeVar.c;
                if (dfgVar == null) {
                    break;
                }
                break;
            case 10:
                break;
            case 11:
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                gzp gzpVar = (gzp) obj;
                gzpVar.f();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ikc ikcVar = ((dop) obj).b;
                if (ikcVar == null) {
                    break;
                }
                break;
            case 15:
                gzp gzpVar2 = (gzp) obj;
                gzpVar2.f();
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                dch dchVar = (dch) obj;
                if (dchVar != null && (r1 = dchVar.a) != null) {
                }
                break;
        }
        return "";
    }
}
