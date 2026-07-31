package com.my.tracker;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.my.tracker.obfuscated.AbstractC1654l;
import com.my.tracker.obfuscated.C1615b3;
import com.my.tracker.obfuscated.InterfaceC1685t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class MyTrackerParams {

    /* renamed from: a, reason: collision with root package name */
    final List f20848a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    final Object f20849b = new Object();

    /* renamed from: c, reason: collision with root package name */
    volatile C1615b3 f20850c = C1615b3.f21150j;

    /* renamed from: d, reason: collision with root package name */
    final Map f20851d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    volatile String f20852e = null;

    /* renamed from: f, reason: collision with root package name */
    volatile String f20853f = null;

    /* renamed from: g, reason: collision with root package name */
    volatile String f20854g = null;

    /* renamed from: h, reason: collision with root package name */
    volatile String f20855h = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f20856a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20857b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20858c;

        /* renamed from: d, reason: collision with root package name */
        public final String f20859d;

        /* renamed from: e, reason: collision with root package name */
        public final Map f20860e;

        public a(String str, String str2, String str3, String str4, Map map) {
            this.f20856a = str;
            this.f20857b = str2;
            this.f20858c = str3;
            this.f20859d = str4;
            this.f20860e = new HashMap(map);
        }
    }

    private static String b(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public void a(InterfaceC1685t interfaceC1685t, InterfaceC1685t interfaceC1685t2) {
        synchronized (this.f20849b) {
            synchronized (this.f20848a) {
                interfaceC1685t.a(this.f20850c);
                this.f20848a.add(interfaceC1685t2);
            }
        }
    }

    public int getAge() {
        return this.f20850c.f21151a;
    }

    public String getCustomParam(@NonNull String str) {
        return (String) this.f20851d.get(str.toLowerCase(Locale.ROOT));
    }

    public String getCustomUserId() {
        return b(this.f20850c.f21157g);
    }

    public String[] getCustomUserIds() {
        return a(this.f20850c.f21157g);
    }

    public String getEmail() {
        return b(this.f20850c.f21155e);
    }

    public String[] getEmails() {
        return a(this.f20850c.f21155e);
    }

    public int getGender() {
        return this.f20850c.f21152b;
    }

    public String getIcqId() {
        return b(this.f20850c.f21156f);
    }

    public String[] getIcqIds() {
        return a(this.f20850c.f21156f);
    }

    public String getLang() {
        return this.f20852e;
    }

    public String getMrgsAppId() {
        return this.f20853f;
    }

    public String getMrgsId() {
        return this.f20855h;
    }

    public String getMrgsUserId() {
        return this.f20854g;
    }

    public String getOkId() {
        return b(this.f20850c.f21153c);
    }

    public String[] getOkIds() {
        return a(this.f20850c.f21153c);
    }

    public String getPhone() {
        return b(this.f20850c.f21158h);
    }

    public String[] getPhones() {
        return a(this.f20850c.f21158h);
    }

    public String getVkConnectId() {
        return b(this.f20850c.f21159i);
    }

    public String[] getVkConnectIds() {
        return a(this.f20850c.f21159i);
    }

    public String getVkId() {
        return b(this.f20850c.f21154d);
    }

    public String[] getVkIds() {
        return a(this.f20850c.f21154d);
    }

    @NonNull
    public MyTrackerParams setAge(int i4) {
        synchronized (this.f20849b) {
            try {
                if (this.f20850c.f21151a != i4) {
                    C1615b3 c1615b3 = new C1615b3(i4, this.f20850c.f21152b, this.f20850c.f21153c, this.f20850c.f21154d, this.f20850c.f21155e, this.f20850c.f21156f, this.f20850c.f21157g, this.f20850c.f21158h, this.f20850c.f21159i);
                    a(c1615b3);
                    this.f20850c = c1615b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setCustomParam(@NonNull String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (str2 == null) {
            this.f20851d.remove(lowerCase);
            return this;
        }
        this.f20851d.put(lowerCase, str2);
        return this;
    }

    @NonNull
    public MyTrackerParams setCustomUserId(String str) {
        return setCustomUserIds(a(str));
    }

    @NonNull
    public MyTrackerParams setCustomUserIds(String[] strArr) {
        synchronized (this.f20849b) {
            try {
                String[] a4 = a(strArr);
                if (AbstractC1654l.a(this.f20850c.f21157g, strArr) != 0) {
                    C1615b3 c1615b3 = new C1615b3(this.f20850c.f21151a, this.f20850c.f21152b, this.f20850c.f21153c, this.f20850c.f21154d, this.f20850c.f21155e, this.f20850c.f21156f, a4, this.f20850c.f21158h, this.f20850c.f21159i);
                    a(c1615b3);
                    this.f20850c = c1615b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setEmail(String str) {
        return setEmails(a(str));
    }

    @NonNull
    public MyTrackerParams setEmails(String[] strArr) {
        synchronized (this.f20849b) {
            try {
                String[] a4 = a(strArr);
                if (AbstractC1654l.a(this.f20850c.f21155e, strArr) != 0) {
                    C1615b3 c1615b3 = new C1615b3(this.f20850c.f21151a, this.f20850c.f21152b, this.f20850c.f21153c, this.f20850c.f21154d, a4, this.f20850c.f21156f, this.f20850c.f21157g, this.f20850c.f21158h, this.f20850c.f21159i);
                    a(c1615b3);
                    this.f20850c = c1615b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setGender(int i4) {
        synchronized (this.f20849b) {
            try {
                if (this.f20850c.f21152b != i4) {
                    C1615b3 c1615b3 = new C1615b3(this.f20850c.f21151a, i4, this.f20850c.f21153c, this.f20850c.f21154d, this.f20850c.f21155e, this.f20850c.f21156f, this.f20850c.f21157g, this.f20850c.f21158h, this.f20850c.f21159i);
                    a(c1615b3);
                    this.f20850c = c1615b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setIcqId(String str) {
        return setIcqIds(a(str));
    }

    @NonNull
    public MyTrackerParams setIcqIds(String[] strArr) {
        synchronized (this.f20849b) {
            try {
                String[] a4 = a(strArr);
                if (AbstractC1654l.a(this.f20850c.f21156f, strArr) != 0) {
                    C1615b3 c1615b3 = new C1615b3(this.f20850c.f21151a, this.f20850c.f21152b, this.f20850c.f21153c, this.f20850c.f21154d, this.f20850c.f21155e, a4, this.f20850c.f21157g, this.f20850c.f21158h, this.f20850c.f21159i);
                    a(c1615b3);
                    this.f20850c = c1615b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setLang(String str) {
        this.f20852e = str;
        return this;
    }

    @NonNull
    public MyTrackerParams setMrgsAppId(String str) {
        this.f20853f = str;
        return this;
    }

    @NonNull
    public MyTrackerParams setMrgsId(String str) {
        this.f20855h = str;
        return this;
    }

    @NonNull
    public MyTrackerParams setMrgsUserId(String str) {
        this.f20854g = str;
        return this;
    }

    @NonNull
    public MyTrackerParams setOkId(String str) {
        return setOkIds(a(str));
    }

    @NonNull
    public MyTrackerParams setOkIds(String[] strArr) {
        synchronized (this.f20849b) {
            try {
                String[] a4 = a(strArr);
                if (AbstractC1654l.a(this.f20850c.f21153c, strArr) != 0) {
                    C1615b3 c1615b3 = new C1615b3(this.f20850c.f21151a, this.f20850c.f21152b, a4, this.f20850c.f21154d, this.f20850c.f21155e, this.f20850c.f21156f, this.f20850c.f21157g, this.f20850c.f21158h, this.f20850c.f21159i);
                    a(c1615b3);
                    this.f20850c = c1615b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setPhone(String str) {
        return setPhones(a(str));
    }

    @NonNull
    public MyTrackerParams setPhones(String[] strArr) {
        synchronized (this.f20849b) {
            try {
                String[] a4 = a(strArr);
                if (AbstractC1654l.a(this.f20850c.f21158h, strArr) != 0) {
                    C1615b3 c1615b3 = new C1615b3(this.f20850c.f21151a, this.f20850c.f21152b, this.f20850c.f21153c, this.f20850c.f21154d, this.f20850c.f21155e, this.f20850c.f21156f, this.f20850c.f21157g, a4, this.f20850c.f21159i);
                    a(c1615b3);
                    this.f20850c = c1615b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setVkConnectId(String str) {
        return setVkConnectIds(a(str));
    }

    @NonNull
    public MyTrackerParams setVkConnectIds(String[] strArr) {
        synchronized (this.f20849b) {
            try {
                String[] a4 = a(strArr);
                if (AbstractC1654l.a(this.f20850c.f21159i, strArr) != 0) {
                    C1615b3 c1615b3 = new C1615b3(this.f20850c.f21151a, this.f20850c.f21152b, this.f20850c.f21153c, this.f20850c.f21154d, this.f20850c.f21155e, this.f20850c.f21156f, this.f20850c.f21157g, this.f20850c.f21158h, a4);
                    a(c1615b3);
                    this.f20850c = c1615b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setVkId(String str) {
        return setVkIds(a(str));
    }

    @NonNull
    public MyTrackerParams setVkIds(String[] strArr) {
        synchronized (this.f20849b) {
            try {
                String[] a4 = a(strArr);
                if (AbstractC1654l.a(this.f20850c.f21154d, strArr) != 0) {
                    C1615b3 c1615b3 = new C1615b3(this.f20850c.f21151a, this.f20850c.f21152b, this.f20850c.f21153c, a4, this.f20850c.f21155e, this.f20850c.f21156f, this.f20850c.f21157g, this.f20850c.f21158h, this.f20850c.f21159i);
                    a(c1615b3);
                    this.f20850c = c1615b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    private static String[] a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    private static String[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String[]{str};
    }

    private void a(C1615b3 c1615b3) {
        synchronized (this.f20848a) {
            try {
                Iterator it = this.f20848a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1685t) it.next()).a(c1615b3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a a() {
        return new a(this.f20853f, this.f20854g, this.f20855h, this.f20852e, this.f20851d);
    }
}
