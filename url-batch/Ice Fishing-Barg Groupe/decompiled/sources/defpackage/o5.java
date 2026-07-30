package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.view.View;
import com.ice.fishing.grenza.data.db.AppDatabase_Impl;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class o5 implements ae0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ o5(uf ufVar, long j) {
        this.rtx2ld2ELZv4 = 2;
        this.OPXfSBeufaJ8 = ufVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4;
        p50 p50Var = p50.rtx2ld2ELZv4;
        char c = 0;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                fx1.IXK6ba3ucyzm((p5) obj);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                String string = Settings.Secure.getString(((q3) obj).PxuCJdSBwIXG.getContentResolver(), "android_id");
                if (string != null) {
                    break;
                }
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                ((df2) obj).close();
                break;
            case 10:
                wd0 wd0Var = (wd0) obj;
                Context context = wd0Var.rtx2ld2ELZv4;
                String str = wd0Var.OPXfSBeufaJ8;
                i2 i2Var = new i2(12, c);
                i2Var.OPXfSBeufaJ8 = null;
                vd0 vd0Var = new vd0(context, str, i2Var, wd0Var.wdg6QnbFHrFF);
                vd0Var.setWriteAheadLoggingEnabled(wd0Var.x50lh2ztY7Y5);
                break;
            case 11:
                cf0 cf0Var = (cf0) obj;
                l92 l92Var = cf0Var.lS5Rgt96tfkO;
                ArrayList arrayList = new ArrayList(9);
                while (c < '\t') {
                    arrayList.add("");
                    c++;
                }
                l92Var.getClass();
                l92Var.OPXfSBeufaJ8(null, arrayList);
                l92 l92Var2 = cf0Var.Y1f8riQaR6yg;
                l92Var2.getClass();
                l92Var2.OPXfSBeufaJ8(null, "X");
                l92 l92Var3 = cf0Var.a92UlCVFR9N8;
                l92Var3.getClass();
                l92Var3.OPXfSBeufaJ8(null, "");
                l92 l92Var4 = cf0Var.rtx2ld2ELZv4;
                Boolean bool = Boolean.FALSE;
                l92Var4.getClass();
                l92Var4.OPXfSBeufaJ8(null, bool);
                l92 l92Var5 = cf0Var.wdg6QnbFHrFF;
                l92Var5.getClass();
                l92Var5.OPXfSBeufaJ8(null, p50Var);
                break;
            case 12:
                try {
                    break;
                } catch (SSLPeerUnverifiedException unused) {
                    return p50Var;
                }
            case 13:
                ll0 ll0Var = (ll0) obj;
                ll0Var.getClass();
                try {
                    ll0Var.rZjpSjn4zoMv.XL4ISE6Oc65B(2, 0, false);
                    break;
                } catch (IOException e) {
                    o60 o60Var = o60.wdg6QnbFHrFF;
                    ll0Var.lS5Rgt96tfkO(o60Var, o60Var, e);
                    break;
                }
            case 14:
                break;
            case 15:
                Object systemService = ((View) ((op0) obj).OPXfSBeufaJ8).getContext().getSystemService("input_method");
                systemService.getClass();
                break;
            case 16:
                AppDatabase_Impl appDatabase_Impl = ((ns0) obj).PxuCJdSBwIXG;
                break;
            case 17:
                ov0 ov0Var = (ov0) obj;
                fx1.KUoIVIumpKat(fx1.nxJAScVArhE9(ov0Var), null, new hm(ov0Var, null), 3);
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                z91 z91Var = ((x91) obj).QrzZRwfaDlRX;
                if (!z91Var.OPXfSBeufaJ8) {
                    u9.rtx2ld2ELZv4("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    break;
                } else if (z91Var.wdg6QnbFHrFF.rtx2ld2ELZv4 == f01.rtx2ld2ELZv4) {
                    u9.rtx2ld2ELZv4("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    break;
                } else {
                    ir2 ir2Var = nr2.Companion;
                    x91 x91Var = z91Var.PxuCJdSBwIXG;
                    kr2 kr2Var = (kr2) z91Var.cpQdD2nAriOS.getValue();
                    zu EpkonXwzFgDB = ki0.EpkonXwzFgDB(x91Var);
                    ir2Var.getClass();
                    kr2Var.getClass();
                    EpkonXwzFgDB.getClass();
                    e0 e0Var = new e0(x91Var.RAsUl2FVSrh6(), kr2Var, EpkonXwzFgDB);
                    ck PxuCJdSBwIXG = bu1.PxuCJdSBwIXG(y91.class);
                    String lS5Rgt96tfkO = PxuCJdSBwIXG.lS5Rgt96tfkO();
                    if (lS5Rgt96tfkO == null) {
                        u9.XL4ISE6Oc65B("Local and anonymous classes can not be ViewModels");
                        break;
                    } else {
                        break;
                    }
                }
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                wj1 wj1Var = (wj1) obj;
                break;
            case 25:
                ko1 ko1Var = (ko1) obj;
                d42 x50lh2ztY7Y5 = kj0.x50lh2ztY7Y5("kotlinx.serialization.Polymorphic", jo1.e9gEMXR7LXtO, new SerialDescriptor[0], new r3s1LDPKFs1S(26, ko1Var));
                eu0 eu0Var = ko1Var.PxuCJdSBwIXG;
                eu0Var.getClass();
                break;
            case 26:
                l92 l92Var6 = ((wr1) obj).e9gEMXR7LXtO;
                l92Var6.getClass();
                l92Var6.OPXfSBeufaJ8(null, "All");
                break;
            case 27:
                kv2.PxuCJdSBwIXG((fs2) obj);
                break;
            case 28:
                kv2.PxuCJdSBwIXG((Closeable) ((zt1) obj).rtx2ld2ELZv4);
                break;
            default:
                js1 js1Var = ((vs1) obj).rtx2ld2ELZv4;
                js1Var.getClass();
                js1Var.Y1f8riQaR6yg();
                break;
        }
        return no2Var;
        return no2Var;
    }

    public /* synthetic */ o5(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }
}
