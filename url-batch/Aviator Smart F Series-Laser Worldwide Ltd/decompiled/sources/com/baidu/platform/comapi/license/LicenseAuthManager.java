package com.baidu.platform.comapi.license;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mapapi.CommonInfo;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.ILicenseAuthListener;
import com.baidu.mapauto.auth.LicenseAuth;
import com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess;
import com.baidu.mapauto.auth.constant.ErrorCode;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import com.baidu.mapsdkplatform.comapi.util.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class LicenseAuthManager implements ILicenseAuthManager {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<b, Map<String, Integer>> f9328a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<d<ILicenseAuthManagerListener>> f9329b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f9330c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9331d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9332e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9333f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9334g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9335h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9336i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9337j;

    /* renamed from: k, reason: collision with root package name */
    private final String f9338k;

    /* renamed from: l, reason: collision with root package name */
    private final String f9339l;

    /* renamed from: m, reason: collision with root package name */
    private final int f9340m;

    /* renamed from: n, reason: collision with root package name */
    private final List<IExtraLicenseAuth> f9341n;

    /* renamed from: o, reason: collision with root package name */
    private ILicenseAuthListener f9342o;

    public static class Builder {
        private String mAk;
        private String mAppVersion;
        private String mChannel;
        private String mCuid;
        private String mDeviceId;
        private List<IExtraLicenseAuth> mExtraLicenseAuths;
        private String mFunctionName;
        private String mModel;
        private String mOsVersion;
        private String mServiceName;
        private int mType;

        public Builder ak(String str) {
            this.mAk = str;
            return this;
        }

        public Builder appVersion(String str) {
            this.mAppVersion = str;
            return this;
        }

        public ILicenseAuthManager build() {
            return new LicenseAuthManager(this.mAk, this.mChannel, this.mDeviceId, this.mCuid, this.mAppVersion, this.mOsVersion, this.mModel, this.mServiceName, this.mFunctionName, this.mType, this.mExtraLicenseAuths);
        }

        public Builder channel(String str) {
            this.mChannel = str;
            return this;
        }

        public Builder cuid(String str) {
            this.mCuid = str;
            return this;
        }

        public Builder deviceId(String str) {
            this.mDeviceId = str;
            return this;
        }

        public Builder extraAuth(List<IExtraLicenseAuth> list) {
            this.mExtraLicenseAuths = list;
            return this;
        }

        public Builder functionName(String str) {
            this.mFunctionName = str;
            return this;
        }

        public Builder model(String str) {
            this.mModel = str;
            return this;
        }

        public Builder osVersion(String str) {
            this.mOsVersion = str;
            return this;
        }

        public Builder serviceName(String str) {
            this.mServiceName = str;
            return this;
        }

        public Builder type(int i8) {
            this.mType = i8;
            return this;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f9343a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9344b;

        /* renamed from: c, reason: collision with root package name */
        private final String f9345c;

        public b(String str, String str2, int i8) {
            this.f9344b = str;
            this.f9345c = str2;
            this.f9343a = i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            String str = "" + this.f9344b + "" + this.f9345c + "" + this.f9343a;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            b bVar = (b) obj;
            sb.append(bVar.f9344b);
            sb.append("");
            sb.append(bVar.f9345c);
            sb.append("");
            sb.append(bVar.f9343a);
            return str.equals(sb.toString());
        }

        public int hashCode() {
            if (TextUtils.isEmpty(this.f9344b) && TextUtils.isEmpty(this.f9345c)) {
                return super.hashCode();
            }
            int i8 = this.f9343a;
            if (!TextUtils.isEmpty(this.f9344b)) {
                i8 = (i8 * 31) + this.f9344b.hashCode();
            }
            return !TextUtils.isEmpty(this.f9345c) ? (i8 * 31) + this.f9345c.hashCode() : i8;
        }
    }

    private class c implements ILicenseAuthListener {

        /* renamed from: a, reason: collision with root package name */
        private final ILicenseAuthManagerListener f9346a;

        public c(ILicenseAuthManagerListener iLicenseAuthManagerListener) {
            this.f9346a = iLicenseAuthManagerListener;
        }

        @Override // com.baidu.mapauto.auth.ILicenseAuthListener
        public void onError(int i8, String str, Exception exc) {
            int a8 = LicenseAuthManager.this.a(i8);
            LicenseAuthManager.f9328a.remove(new b(LicenseAuthManager.this.f9338k, LicenseAuthManager.this.f9339l, LicenseAuthManager.this.f9340m));
            ILicenseAuthManagerListener iLicenseAuthManagerListener = this.f9346a;
            if (iLicenseAuthManagerListener != null) {
                iLicenseAuthManagerListener.onError(LicenseAuthManager.this.f9338k, LicenseAuthManager.this.f9339l, LicenseAuthManager.this.f9340m, a8, str);
            }
            LicenseAuthManager licenseAuthManager = LicenseAuthManager.this;
            licenseAuthManager.a(licenseAuthManager.f9338k, LicenseAuthManager.this.f9339l, LicenseAuthManager.this.f9340m, a8, str);
        }

        @Override // com.baidu.mapauto.auth.ILicenseAuthListener
        public void onSuccess(Map<String, Integer> map) {
            LicenseAuthManager.f9328a.put(new b(LicenseAuthManager.this.f9338k, LicenseAuthManager.this.f9339l, LicenseAuthManager.this.f9340m), map);
            ILicenseAuthManagerListener iLicenseAuthManagerListener = this.f9346a;
            if (iLicenseAuthManagerListener != null) {
                iLicenseAuthManagerListener.onSuccess(LicenseAuthManager.this.f9338k, LicenseAuthManager.this.f9339l, LicenseAuthManager.this.f9340m, map);
            }
            LicenseAuthManager licenseAuthManager = LicenseAuthManager.this;
            licenseAuthManager.a(licenseAuthManager.f9338k, LicenseAuthManager.this.f9339l, LicenseAuthManager.this.f9340m, map);
        }
    }

    private static class d<T> extends WeakReference<T> {
        public d(T t7) {
            super(t7);
        }

        public boolean equals(Object obj) {
            T t7 = get();
            return t7 != null ? t7.equals(obj) : super.equals(obj);
        }

        public int hashCode() {
            T t7 = get();
            return t7 != null ? t7.hashCode() : super.hashCode();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9330c = hashMap;
        hashMap.put(0, 0);
        hashMap.put(-1001, 1);
        hashMap.put(-1002, 2);
        hashMap.put(-1003, 100);
        hashMap.put(-1004, 101);
        hashMap.put(Integer.valueOf(ErrorCode.CODE_SERVER_ERROR), 102);
        hashMap.put(Integer.valueOf(ErrorCode.CODE_CHECK_SIGN_ERROR), 202);
        hashMap.put(-1000, 1000);
    }

    public static void addLicenseAuthLicense(ILicenseAuthManagerListener iLicenseAuthManagerListener) {
        f9329b.add(new d<>(iLicenseAuthManagerListener));
    }

    public static void removeLicenseAuthLicense(ILicenseAuthManagerListener iLicenseAuthManagerListener) {
        Iterator<d<ILicenseAuthManagerListener>> it = f9329b.iterator();
        while (it.hasNext()) {
            ILicenseAuthManagerListener iLicenseAuthManagerListener2 = it.next().get();
            if (iLicenseAuthManagerListener2 == null) {
                it.remove();
            } else if (iLicenseAuthManagerListener2 == iLicenseAuthManagerListener) {
                it.remove();
            }
        }
    }

    @Override // com.baidu.platform.comapi.license.ILicenseAuthManager
    public boolean isEffective(String str, String str2) {
        if (("" + this.f9338k).equals("" + str)) {
            if (("" + this.f9339l).equals("" + str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.baidu.platform.comapi.license.ILicenseAuthManager
    public boolean isHaveAuthority() {
        Integer num;
        Map<String, Integer> map = f9328a.get(new b(this.f9338k, this.f9339l, this.f9340m));
        return (map == null || (num = map.get(this.f9339l)) == null || num.intValue() != 0) ? false : true;
    }

    @Override // com.baidu.platform.comapi.license.ILicenseAuthManager
    public void loadAuth(Context context, ILicenseAuthManagerListener iLicenseAuthManagerListener) {
        try {
            b();
            HashMap hashMap = new HashMap();
            hashMap.put(AuthCore.AuthParam.KEY_EXTRA_CUID, this.f9334g);
            hashMap.put(AuthCore.AuthParam.KEY_EXTRA_APP_VERSION, this.f9335h);
            hashMap.put(AuthCore.AuthParam.KEY_EXTRA_OS_VERSION, this.f9336i);
            hashMap.put(AuthCore.AuthParam.KEY_EXTRA_MODEL, this.f9337j);
            this.f9342o = new c(iLicenseAuthManagerListener);
            LicenseAuth.getInstance().loadAuth(context, this.f9331d, this.f9332e, this.f9333f, this.f9338k, this.f9339l, this.f9340m, hashMap, this.f9342o);
        } catch (BaseLicenseAuthDataStandardProcess.ProcessException e8) {
            int code = e8.getCode();
            String message = e8.getMessage();
            f9328a.remove(new b(this.f9338k, this.f9339l, this.f9340m));
            if (iLicenseAuthManagerListener != null) {
                iLicenseAuthManagerListener.onError(this.f9338k, this.f9339l, this.f9340m, code, message);
            }
            a(this.f9338k, this.f9339l, this.f9340m, code, message);
        }
    }

    @Override // com.baidu.platform.comapi.license.ILicenseAuthManager
    public Map<String, Integer> loadLocalAuth(Context context) {
        b();
        try {
            return LicenseAuth.getInstance().loadLocalAuth(context, this.f9331d, this.f9332e, this.f9333f, this.f9338k, this.f9339l, this.f9340m);
        } catch (BaseLicenseAuthDataStandardProcess.ProcessException e8) {
            throw new BaseLicenseAuthDataStandardProcess.ProcessException(a(e8.getCode()), e8.getMessage());
        }
    }

    private LicenseAuthManager(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i8, List<IExtraLicenseAuth> list) {
        this.f9331d = TextUtils.isEmpty(str) ? PermissionCheck.getApiKey() : str;
        CommonInfo a8 = com.baidu.mapsdkplatform.comapi.b.a();
        if (TextUtils.isEmpty(str2)) {
            this.f9332e = a8 == null ? "" : a8.getChannel();
        } else {
            this.f9332e = str2;
        }
        if (TextUtils.isEmpty(str3)) {
            this.f9333f = a8 != null ? a8.getShareDeviceId() : "";
        } else {
            this.f9333f = str3;
        }
        this.f9334g = TextUtils.isEmpty(str4) ? g.c() : str4;
        this.f9335h = TextUtils.isEmpty(str5) ? g.o() : str5;
        this.f9336i = TextUtils.isEmpty(str6) ? g.k() : str6;
        this.f9337j = TextUtils.isEmpty(str7) ? g.l() : str7;
        this.f9338k = str8;
        this.f9339l = str9;
        this.f9340m = i8;
        this.f9341n = list;
    }

    private void b() {
        List<IExtraLicenseAuth> list = this.f9341n;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<IExtraLicenseAuth> it = list.iterator();
        while (it.hasNext()) {
            it.next().check();
        }
    }

    @Override // com.baidu.platform.comapi.license.ILicenseAuthManager
    public boolean isHaveAuthority(Map<String, Integer> map) {
        Integer num;
        return (map == null || (num = map.get(this.f9339l)) == null || num.intValue() != 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i8, Map<String, Integer> map) {
        Iterator<d<ILicenseAuthManagerListener>> it = f9329b.iterator();
        while (it.hasNext()) {
            ILicenseAuthManagerListener iLicenseAuthManagerListener = it.next().get();
            if (iLicenseAuthManagerListener == null) {
                it.remove();
            } else {
                iLicenseAuthManagerListener.onSuccess(str, str2, i8, map);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i8, int i9, String str3) {
        Iterator<d<ILicenseAuthManagerListener>> it = f9329b.iterator();
        while (it.hasNext()) {
            ILicenseAuthManagerListener iLicenseAuthManagerListener = it.next().get();
            if (iLicenseAuthManagerListener == null) {
                it.remove();
            } else {
                iLicenseAuthManagerListener.onError(str, str2, i8, i9, str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i8) {
        Integer num = f9330c.get(Integer.valueOf(i8));
        return num == null ? i8 : num.intValue();
    }
}
