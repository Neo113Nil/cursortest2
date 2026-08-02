package defpackage;

import android.content.Context;
import android.util.Log;
import j$.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.logging.Logger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gxw implements gzf {
    private final /* synthetic */ int a;

    public /* synthetic */ gxw(int i) {
        this.a = i;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        switch (this.a) {
            case 0:
                return gub.a;
            case 1:
                hkh hkhVar = gri.a;
                return null;
            case 2:
                Collection collection = (Collection) obj;
                return collection instanceof SortedSet ? DesugarCollections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? DesugarCollections.unmodifiableSet((Set) collection) : collection instanceof List ? DesugarCollections.unmodifiableList((List) collection) : DesugarCollections.unmodifiableCollection(collection);
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new hrp(entry);
            case 4:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return new hrt(entry2);
            case 5:
                int i = hvb.a;
                return Boolean.valueOf(((List) obj).contains(String.class));
            case 6:
                int i2 = hvb.a;
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            case 7:
                int i3 = hvb.a;
                return Arrays.asList(((Constructor) obj).getParameterTypes());
            case 8:
                return ((kbn) obj).name();
            case 9:
                return Boolean.valueOf(((iea) obj).n());
            case 10:
                return ((ikm) obj).b;
            case 11:
                return ((ikm) obj).a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Log.e("ClientLoggingBackend", "Logging to Clearcut failed.", (Exception) obj);
                return null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Context context = (Context) obj;
                String str8 = jsg.a;
                if (str8 != null) {
                    return str8;
                }
                synchronized (jsg.class) {
                    str = jsg.a;
                    if (str == null) {
                        str = etb.e(context, "com.google.android.apps.authenticator");
                        jsg.a = str;
                    }
                }
                return str;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Context context2 = (Context) obj;
                String str9 = jsq.a;
                if (str9 != null) {
                    return str9;
                }
                synchronized (jsq.class) {
                    str2 = jsq.a;
                    if (str2 == null) {
                        str2 = etb.e(context2, "com.google.android.gms.auth_account_client");
                        jsq.a = str2;
                    }
                }
                return str2;
            case 15:
                Context context3 = (Context) obj;
                String str10 = jsx.a;
                if (str10 != null) {
                    return str10;
                }
                synchronized (jsx.class) {
                    str3 = jsx.a;
                    if (str3 == null) {
                        str3 = etb.e(context3, "com.google.android.gms.clearcut_client");
                        jsx.a = str3;
                    }
                }
                return str3;
            case 16:
                Context context4 = (Context) obj;
                String str11 = jtf.a;
                if (str11 != null) {
                    return str11;
                }
                synchronized (jtf.class) {
                    str4 = jtf.a;
                    if (str4 == null) {
                        str4 = etb.e(context4, "com.google.android.libraries.consentverifier");
                        jtf.a = str4;
                    }
                }
                return str4;
            case 17:
                Context context5 = (Context) obj;
                String str12 = jtk.a;
                if (str12 != null) {
                    return str12;
                }
                synchronized (jtk.class) {
                    str5 = jtk.a;
                    if (str5 == null) {
                        str5 = etb.e(context5, "com.google.android.libraries.mdi.sync");
                        jtk.a = str5;
                    }
                }
                return str5;
            case 18:
                Context context6 = (Context) obj;
                String str13 = jto.a;
                if (str13 != null) {
                    return str13;
                }
                synchronized (jto.class) {
                    str6 = jto.a;
                    if (str6 == null) {
                        str6 = etb.e(context6, "com.google.android.libraries.onegoogle");
                        jto.a = str6;
                    }
                }
                return str6;
            case 19:
                Context context7 = (Context) obj;
                String str14 = jts.a;
                if (str14 != null) {
                    return str14;
                }
                synchronized (jts.class) {
                    str7 = jts.a;
                    if (str7 == null) {
                        str7 = etb.e(context7, "com.google.android.libraries.performance.primes");
                        jts.a = str7;
                    }
                }
                return str7;
            default:
                Logger logger = kju.f;
                return ((kjt) obj).a;
        }
    }
}
