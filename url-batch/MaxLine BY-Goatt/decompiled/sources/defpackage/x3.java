package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x3 extends w3 {
    public final /* synthetic */ int a;

    public /* synthetic */ x3(int i) {
        this.a = i;
    }

    @Override // defpackage.w3
    public final Intent createIntent(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
                type.getClass();
                return type;
            case 1:
                i12 i12Var = (i12) obj;
                i12Var.getClass();
                if (c2.g()) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(c2.d(i12Var.a));
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent;
                }
                kr0 kr0Var = (kr0) context;
                if (kr0Var.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent2.setType(c2.d(i12Var.a));
                    if (intent2.getType() != null) {
                        return intent2;
                    }
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent2;
                }
                ResolveInfo resolveActivity = kr0Var.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveActivity == null) {
                    lh.g("Required value was null.");
                    return null;
                }
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent3.setType(c2.d(i12Var.a));
                intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                return intent3;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                putExtra.getClass();
                return putExtra;
            case 3:
                Intent intent4 = (Intent) obj;
                intent4.getClass();
                return intent4;
            default:
                z31 z31Var = (z31) obj;
                Intent intent5 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent6 = z31Var.n;
                if (intent6 != null && (bundleExtra = intent6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent5.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        z31Var = new z31(z31Var.m, null, z31Var.o, z31Var.p);
                    }
                }
                intent5.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", z31Var);
                if (as0.G(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent5);
                }
                return intent5;
        }
    }

    @Override // defpackage.w3
    public v3 getSynchronousResult(Context context, Object obj) {
        switch (this.a) {
            case 0:
                context.getClass();
                ((String) obj).getClass();
                return null;
            case 1:
                context.getClass();
                ((i12) obj).getClass();
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                context.getClass();
                strArr.getClass();
                if (strArr.length == 0) {
                    return new v3(mi1.c());
                }
                for (String str : strArr) {
                    if (o70.s(context, str) != 0) {
                        return null;
                    }
                }
                int a = li1.a(strArr.length);
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new v3(linkedHashMap);
            default:
                return super.getSynchronousResult(context, obj);
        }
    }

    @Override // defpackage.w3
    public final Object parseResult(int i, Intent intent) {
        List arrayList;
        switch (this.a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Uri data2 = intent.getData();
                        if (data2 != null) {
                            linkedHashSet.add(data2);
                        }
                        ClipData clipData = intent.getClipData();
                        if (clipData == null && linkedHashSet.isEmpty()) {
                            arrayList = ah0.m;
                        } else {
                            if (clipData != null) {
                                int itemCount = clipData.getItemCount();
                                for (int i2 = 0; i2 < itemCount; i2++) {
                                    Uri uri = clipData.getItemAt(i2).getUri();
                                    if (uri != null) {
                                        linkedHashSet.add(uri);
                                    }
                                }
                            }
                            arrayList = new ArrayList(linkedHashSet);
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (i != -1) {
                    break;
                } else if (intent == null) {
                    break;
                } else {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i3 == 0));
                        }
                        ArrayList p = oi.p(stringArrayExtra);
                        Iterator it = p.iterator();
                        Iterator it2 = arrayList2.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(rv.l(p, 10), rv.l(arrayList2, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new Pair(it.next(), it2.next()));
                        }
                        break;
                    } else {
                        break;
                    }
                }
        }
        return new t3(i, intent);
    }
}
