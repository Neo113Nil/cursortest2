package s;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public class a extends BroadcastReceiver {

    /* renamed from: s.a$a, reason: collision with other inner class name */
    private static class C0134a extends MediaBrowserCompat.c {

        /* renamed from: c, reason: collision with root package name */
        private final Context f21378c;

        /* renamed from: d, reason: collision with root package name */
        private final Intent f21379d;

        /* renamed from: e, reason: collision with root package name */
        private final BroadcastReceiver.PendingResult f21380e;

        /* renamed from: f, reason: collision with root package name */
        private MediaBrowserCompat f21381f;

        C0134a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f21378c = context;
            this.f21379d = intent;
            this.f21380e = pendingResult;
        }

        private void e() {
            this.f21381f.b();
            this.f21380e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void a() {
            new MediaControllerCompat(this.f21378c, this.f21381f.c()).a((KeyEvent) this.f21379d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void b() {
            e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void c() {
            e();
        }

        void f(MediaBrowserCompat mediaBrowserCompat) {
            this.f21381f = mediaBrowserCompat;
        }
    }

    public static ComponentName a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (queryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    private static ComponentName b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
    }

    public static KeyEvent c(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.b().a(keyEvent);
        return keyEvent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName b7 = b(context, "android.intent.action.MEDIA_BUTTON");
        if (b7 != null) {
            intent.setComponent(b7);
            androidx.core.content.a.e(context, intent);
            return;
        }
        ComponentName b8 = b(context, "android.media.browse.MediaBrowserService");
        if (b8 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C0134a c0134a = new C0134a(applicationContext, intent, goAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, b8, c0134a, null);
        c0134a.f(mediaBrowserCompat);
        mediaBrowserCompat.a();
    }
}
