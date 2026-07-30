package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.SerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ga1 {
    public static final ea1 Companion = new ea1();
    public final Context PxuCJdSBwIXG;
    public final boolean RAsUl2FVSrh6;
    public final q3 TSizfFm2Yiuu;
    public final Activity Y1f8riQaR6yg;
    public final bc a92UlCVFR9N8;
    public boolean e9gEMXR7LXtO;
    public final la1 lS5Rgt96tfkO;

    public ga1(Context context) {
        Object obj;
        context.getClass();
        this.PxuCJdSBwIXG = context;
        this.lS5Rgt96tfkO = new la1(this, new da1(this, 0));
        this.TSizfFm2Yiuu = new q3(context, (byte) 0);
        Iterator it = z32.ngxnMNrpiKat(context, new xy0(11)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.Y1f8riQaR6yg = (Activity) obj;
        this.a92UlCVFR9N8 = new bc(2, this);
        this.RAsUl2FVSrh6 = true;
        vc1 vc1Var = this.lS5Rgt96tfkO.RfyTYNmI9Srp;
        vc1Var.PxuCJdSBwIXG(new kb1(vc1Var));
        this.lS5Rgt96tfkO.RfyTYNmI9Srp.PxuCJdSBwIXG(new kRWHK87H9qm4(this.PxuCJdSBwIXG));
        new qc2(new da1(this, 1));
    }

    public final int PxuCJdSBwIXG() {
        da daVar = this.lS5Rgt96tfkO.a92UlCVFR9N8;
        int i = 0;
        if (daVar != null && daVar.isEmpty()) {
            return 0;
        }
        Iterator<E> it = daVar.iterator();
        while (it.hasNext()) {
            if (!(((x91) it.next()).OPXfSBeufaJ8 instanceof eb1) && (i = i + 1) < 0) {
                fx1.GlTbNTgfSMqy();
                throw null;
            }
        }
        return i;
    }

    public final void TSizfFm2Yiuu() {
        Bundle PxuCJdSBwIXG;
        Intent intent;
        if (PxuCJdSBwIXG() != 1) {
            Y1f8riQaR6yg();
            return;
        }
        Activity activity = this.Y1f8riQaR6yg;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        la1 la1Var = this.lS5Rgt96tfkO;
        int i = 0;
        if (intArray == null) {
            za1 a92UlCVFR9N8 = la1Var.a92UlCVFR9N8();
            a92UlCVFR9N8.getClass();
            int i2 = a92UlCVFR9N8.OPXfSBeufaJ8.lS5Rgt96tfkO;
            for (eb1 eb1Var = a92UlCVFR9N8.wdg6QnbFHrFF; eb1Var != null; eb1Var = eb1Var.wdg6QnbFHrFF) {
                cb1 cb1Var = eb1Var.OPXfSBeufaJ8;
                if (eb1Var.x50lh2ztY7Y5.lS5Rgt96tfkO != i2) {
                    Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        intent2.getClass();
                        ZbWwgt3aGe7A.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                        eb1 OPXfSBeufaJ8 = la1Var.OPXfSBeufaJ8();
                        Intent intent3 = activity.getIntent();
                        intent3.getClass();
                        ya1 e9gEMXR7LXtO = OPXfSBeufaJ8.e9gEMXR7LXtO(new m9(intent3.getData(), intent3.getAction(), intent3.getType(), 13), OPXfSBeufaJ8);
                        if ((e9gEMXR7LXtO != null ? e9gEMXR7LXtO.OPXfSBeufaJ8 : null) != null && (PxuCJdSBwIXG = e9gEMXR7LXtO.rtx2ld2ELZv4.PxuCJdSBwIXG(e9gEMXR7LXtO.OPXfSBeufaJ8)) != null) {
                            ZbWwgt3aGe7A.putAll(PxuCJdSBwIXG);
                        }
                    }
                    xb xbVar = new xb((lb1) this);
                    int i3 = cb1Var.lS5Rgt96tfkO;
                    ArrayList arrayList = (ArrayList) xbVar.a92UlCVFR9N8;
                    arrayList.clear();
                    arrayList.add(new ua1(i3, null));
                    if (((eb1) xbVar.e9gEMXR7LXtO) != null) {
                        xbVar.gPXPFXrUH4XX();
                    }
                    ((Intent) xbVar.Y1f8riQaR6yg).putExtra("android-support-nav:controller:deepLinkExtras", ZbWwgt3aGe7A);
                    xbVar.a92UlCVFR9N8().lS5Rgt96tfkO();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                i2 = cb1Var.lS5Rgt96tfkO;
            }
            return;
        }
        if (this.e9gEMXR7LXtO) {
            activity.getClass();
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            extras2.getClass();
            int[] intArray2 = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            intArray2.getClass();
            ArrayList arrayList2 = new ArrayList(intArray2.length);
            for (int i4 : intArray2) {
                arrayList2.add(Integer.valueOf(i4));
            }
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayList2.size() < 2) {
                return;
            }
            int intValue = ((Number) el.W7ceZOzvrRuI(arrayList2)).intValue();
            if (parcelableArrayList != null) {
            }
            za1 Y1f8riQaR6yg = la1.Y1f8riQaR6yg(intValue, la1Var.RAsUl2FVSrh6(), null, false);
            if (Y1f8riQaR6yg instanceof eb1) {
                eb1.Companion.getClass();
                intValue = db1.PxuCJdSBwIXG((eb1) Y1f8riQaR6yg).OPXfSBeufaJ8.lS5Rgt96tfkO;
            }
            za1 a92UlCVFR9N82 = la1Var.a92UlCVFR9N8();
            if (a92UlCVFR9N82 == null || intValue != a92UlCVFR9N82.OPXfSBeufaJ8.lS5Rgt96tfkO) {
                return;
            }
            xb xbVar2 = new xb((lb1) this);
            Bundle ZbWwgt3aGe7A2 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
            ZbWwgt3aGe7A2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
            Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
            if (bundle != null) {
                ZbWwgt3aGe7A2.putAll(bundle);
            }
            ((Intent) xbVar2.Y1f8riQaR6yg).putExtra("android-support-nav:controller:deepLinkExtras", ZbWwgt3aGe7A2);
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                int i6 = i + 1;
                if (i < 0) {
                    fx1.mFd1aGiJX24N();
                    throw null;
                }
                ((ArrayList) xbVar2.a92UlCVFR9N8).add(new ua1(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
                if (((eb1) xbVar2.e9gEMXR7LXtO) != null) {
                    xbVar2.gPXPFXrUH4XX();
                }
                i = i6;
            }
            xbVar2.a92UlCVFR9N8().lS5Rgt96tfkO();
            activity.finish();
        }
    }

    public final boolean Y1f8riQaR6yg() {
        la1 la1Var = this.lS5Rgt96tfkO;
        if (!la1Var.a92UlCVFR9N8.isEmpty()) {
            za1 a92UlCVFR9N8 = la1Var.a92UlCVFR9N8();
            a92UlCVFR9N8.getClass();
            if (la1Var.x50lh2ztY7Y5(a92UlCVFR9N8.OPXfSBeufaJ8.lS5Rgt96tfkO, true, false) && la1Var.lS5Rgt96tfkO()) {
                return true;
            }
        }
        return false;
    }

    public final void lS5Rgt96tfkO(Object obj, le0 le0Var) {
        String str;
        obj.getClass();
        la1 la1Var = this.lS5Rgt96tfkO;
        la1Var.getClass();
        xb1 gGoUzNp9JO5I = xi0.gGoUzNp9JO5I(le0Var);
        obj.getClass();
        za1 Y1f8riQaR6yg = la1.Y1f8riQaR6yg(ni0.EcgxDIVH5in8(SerializersKt.serializer(bu1.PxuCJdSBwIXG(obj.getClass()))), la1Var.RAsUl2FVSrh6(), null, true);
        if (Y1f8riQaR6yg != null) {
            Map TSizfFm2Yiuu = Y1f8riQaR6yg.TSizfFm2Yiuu();
            LinkedHashMap linkedHashMap = new LinkedHashMap(w41.i68hK7ahKtgp(TSizfFm2Yiuu.size()));
            for (Map.Entry entry : TSizfFm2Yiuu.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((v91) entry.getValue()).PxuCJdSBwIXG);
            }
            str = ni0.S9EYkSpbGuxq(obj, linkedHashMap);
        } else {
            u9.dgRBjINgWbAK("Destination with route ", bu1.PxuCJdSBwIXG(obj.getClass()).TSizfFm2Yiuu(), " cannot be found in navigation graph ", la1Var.TSizfFm2Yiuu);
            str = null;
        }
        if (la1Var.TSizfFm2Yiuu == null) {
            u9.x50lh2ztY7Y5("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", la1Var, 46);
            return;
        }
        eb1 OPXfSBeufaJ8 = la1Var.OPXfSBeufaJ8();
        ya1 a92UlCVFR9N8 = OPXfSBeufaJ8.a92UlCVFR9N8(str, true, OPXfSBeufaJ8);
        if (a92UlCVFR9N8 == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + la1Var.TSizfFm2Yiuu);
        }
        za1 za1Var = a92UlCVFR9N8.rtx2ld2ELZv4;
        Bundle PxuCJdSBwIXG = za1Var.PxuCJdSBwIXG(a92UlCVFR9N8.OPXfSBeufaJ8);
        if (PxuCJdSBwIXG == null) {
            PxuCJdSBwIXG = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
        }
        va1 va1Var = wa1.Companion;
        xa1 xa1Var = za1.Companion;
        String str2 = (String) za1Var.OPXfSBeufaJ8.a92UlCVFR9N8;
        xa1Var.getClass();
        Uri parse = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        parse.getClass();
        va1Var.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        PxuCJdSBwIXG.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        la1Var.dgRBjINgWbAK(za1Var, PxuCJdSBwIXG, gGoUzNp9JO5I);
    }
}
