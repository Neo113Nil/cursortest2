package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sj1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Context n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sj1(Context context, int i) {
        super(1);
        this.m = i;
        this.n = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Context context = this.n;
        switch (i) {
            case 0:
                ((Context) obj).getClass();
                return new tj1(context, 0);
            default:
                Bundle bundle = (Bundle) obj;
                up1 l = ap.l(context);
                LinkedHashMap linkedHashMap = l.n;
                if (bundle == null) {
                    return l;
                }
                bundle.setClassLoader(l.a.getClassLoader());
                l.d = bundle.getBundle("android-support-nav:controller:navigatorState");
                l.e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                linkedHashMap.clear();
                int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                if (intArray != null && stringArrayList != null) {
                    int length = intArray.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        l.m.put(Integer.valueOf(intArray[i2]), stringArrayList.get(i3));
                        i2++;
                        i3++;
                    }
                }
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 != null) {
                    int size = stringArrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        String str = stringArrayList2.get(i4);
                        i4++;
                        String str2 = str;
                        Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str2);
                        if (parcelableArray != null) {
                            str2.getClass();
                            bi biVar = new bi(parcelableArray.length);
                            int i5 = 0;
                            while (i5 < parcelableArray.length) {
                                int i6 = i5 + 1;
                                try {
                                    Parcelable parcelable = parcelableArray[i5];
                                    parcelable.getClass();
                                    biVar.addLast((dp1) parcelable);
                                    i5 = i6;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    ch2.k(e.getMessage());
                                    return null;
                                }
                            }
                            linkedHashMap.put(str2, biVar);
                        }
                    }
                }
                l.f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                return l;
        }
    }
}
