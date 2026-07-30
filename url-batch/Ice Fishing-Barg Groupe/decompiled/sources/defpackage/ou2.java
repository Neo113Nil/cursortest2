package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ou2 extends jc2 implements pe0 {
    public final /* synthetic */ pu2 BRwzKIf41E4i;
    public final /* synthetic */ ContentResolver QrzZRwfaDlRX;
    public final /* synthetic */ Context RfyTYNmI9Srp;
    public final /* synthetic */ eg XL4ISE6Oc65B;
    public int cpQdD2nAriOS;
    public final /* synthetic */ Uri gPXPFXrUH4XX;
    public /* synthetic */ Object r3s1LDPKFs1S;
    public bg x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou2(ContentResolver contentResolver, Uri uri, pu2 pu2Var, eg egVar, Context context, bt btVar) {
        super(2, btVar);
        this.QrzZRwfaDlRX = contentResolver;
        this.gPXPFXrUH4XX = uri;
        this.BRwzKIf41E4i = pu2Var;
        this.XL4ISE6Oc65B = egVar;
        this.RfyTYNmI9Srp = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r6.cpQdD2nAriOS(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0043, B:15:0x0054, B:17:0x005c, B:25:0x002b, B:27:0x003c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        w80 w80Var;
        bg bgVar;
        w80 w80Var2;
        bg bgVar2;
        Object lS5Rgt96tfkO;
        int i = this.cpQdD2nAriOS;
        pu2 pu2Var = this.BRwzKIf41E4i;
        ContentResolver contentResolver = this.QrzZRwfaDlRX;
        su suVar = su.rtx2ld2ELZv4;
        try {
            if (i == 0) {
                ng0.tmVwIGCQF4zR(obj);
                w80Var = (w80) this.r3s1LDPKFs1S;
                contentResolver.registerContentObserver(this.gPXPFXrUH4XX, false, pu2Var);
                bgVar = new bg(this.XL4ISE6Oc65B);
                this.r3s1LDPKFs1S = w80Var;
                this.x50lh2ztY7Y5 = bgVar;
                this.cpQdD2nAriOS = 1;
                lS5Rgt96tfkO = bgVar.lS5Rgt96tfkO(this);
                if (lS5Rgt96tfkO != suVar) {
                }
            } else if (i == 1) {
                bgVar2 = this.x50lh2ztY7Y5;
                w80Var2 = (w80) this.r3s1LDPKFs1S;
                ng0.tmVwIGCQF4zR(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bgVar2 = this.x50lh2ztY7Y5;
                w80Var2 = (w80) this.r3s1LDPKFs1S;
                ng0.tmVwIGCQF4zR(obj);
                w80Var = w80Var2;
                bgVar = bgVar2;
                this.r3s1LDPKFs1S = w80Var;
                this.x50lh2ztY7Y5 = bgVar;
                this.cpQdD2nAriOS = 1;
                lS5Rgt96tfkO = bgVar.lS5Rgt96tfkO(this);
                if (lS5Rgt96tfkO != suVar) {
                    return suVar;
                }
                bg bgVar3 = bgVar;
                w80Var2 = w80Var;
                obj = lS5Rgt96tfkO;
                bgVar2 = bgVar3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(pu2Var);
                    return no2.PxuCJdSBwIXG;
                }
                bgVar2.TSizfFm2Yiuu();
                Context context = this.RfyTYNmI9Srp;
                v81 v81Var = qu2.PxuCJdSBwIXG;
                Float f = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                this.r3s1LDPKFs1S = w80Var2;
                this.x50lh2ztY7Y5 = bgVar2;
                this.cpQdD2nAriOS = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(pu2Var);
            throw th;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        ou2 ou2Var = new ou2(this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, this.XL4ISE6Oc65B, this.RfyTYNmI9Srp, btVar);
        ou2Var.r3s1LDPKFs1S = obj;
        return ou2Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((ou2) gPXPFXrUH4XX((bt) obj2, (w80) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
