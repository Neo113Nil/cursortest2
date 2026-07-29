package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tapjoy.internal.go;
import com.tapjoy.internal.ha;

/* loaded from: classes2.dex */
public class TJContentActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ContentProducer f7676a;

    /* renamed from: b, reason: collision with root package name */
    private ContentProducer f7677b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7678c = false;

    public static abstract class AbstractContentProducer implements ContentProducer {
        @Override // com.tapjoy.TJContentActivity.ContentProducer
        public void dismiss(Activity activity) {
        }

        @Override // com.tapjoy.TJContentActivity.ContentProducer
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        }
    }

    public interface ContentProducer {
        void dismiss(Activity activity);

        void onActivityResult(Activity activity, int i, int i2, Intent intent);

        void show(Activity activity);
    }

    public static void start(Context context, ContentProducer contentProducer, boolean z) {
        Intent intent = new Intent(context, (Class<?>) TJContentActivity.class);
        intent.setFlags(276889600);
        intent.putExtra("com.tapjoy.internal.content.producer.id", toIdentityString(contentProducer));
        intent.putExtra("com.tapjoy.internal.content.fullscreen", z);
        synchronized (TJContentActivity.class) {
            f7676a = contentProducer;
            context.startActivity(intent);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (a(getIntent())) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.f7677b != null) {
            this.f7677b.dismiss(this);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (ha.a().n) {
            this.f7678c = true;
            go.a(this);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        if (this.f7678c) {
            this.f7678c = false;
            go.b(this);
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f7677b.onActivityResult(this, i, i2, intent);
    }

    private boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("com.tapjoy.internal.content.producer.id");
        if (stringExtra == null) {
            return false;
        }
        synchronized (TJContentActivity.class) {
            if (f7676a == null || !stringExtra.equals(toIdentityString(f7676a))) {
                return false;
            }
            this.f7677b = f7676a;
            f7676a = null;
            if (intent.getBooleanExtra("com.tapjoy.internal.content.fullscreen", false)) {
                getWindow().setFlags(1024, 1024);
            }
            this.f7677b.show(this);
            return true;
        }
    }

    public static String toIdentityString(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + System.identityHashCode(obj);
    }
}
