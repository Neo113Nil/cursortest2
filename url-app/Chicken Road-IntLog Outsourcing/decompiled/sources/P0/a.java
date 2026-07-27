package P0;

import B4.i;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import b.C0257b;
import o.AbstractC1347b;
import o.AbstractServiceConnectionC1353h;

/* loaded from: classes.dex */
public final class a extends AbstractServiceConnectionC1353h {

    /* renamed from: a, reason: collision with root package name */
    public final String f2279a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f2280b;

    /* renamed from: c, reason: collision with root package name */
    public i f2281c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2282d;

    public a(String str) {
        this.f2279a = str;
    }

    public final boolean a(Activity context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (this.f2282d) {
            return true;
        }
        try {
            String str = this.f2279a;
            setApplicationContext(context.getApplicationContext());
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(str)) {
                intent.setPackage(str);
            }
            boolean bindService = context.bindService(intent, this, 33);
            if (bindService) {
                this.f2280b = context;
            }
            this.f2282d = bindService;
        } catch (SecurityException unused) {
            this.f2282d = false;
        }
        return this.f2282d;
    }

    @Override // o.AbstractServiceConnectionC1353h
    public final void onCustomTabsServiceConnected(ComponentName name, AbstractC1347b abstractC1347b) {
        kotlin.jvm.internal.i.e(name, "name");
        try {
            ((C0257b) abstractC1347b.f11474a).d();
        } catch (RemoteException unused) {
        }
        name.getPackageName();
        this.f2281c = abstractC1347b.a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f2281c = null;
        this.f2282d = false;
    }
}
