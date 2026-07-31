package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class C implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f11578b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f11579c;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private C(Context context) {
        this.f11579c = context;
    }

    public static C f(Context context) {
        return new C(context);
    }

    public C b(Intent intent) {
        this.f11578b.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C d(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = q.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f11579c.getPackageManager());
            }
            e(component);
            b(supportParentActivityIntent);
        }
        return this;
    }

    public C e(ComponentName componentName) {
        int size = this.f11578b.size();
        try {
            Intent b4 = q.b(this.f11579c, componentName);
            while (b4 != null) {
                this.f11578b.add(size, b4);
                b4 = q.b(this.f11579c, b4.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e4);
        }
    }

    public void g() {
        h(null);
    }

    public void h(Bundle bundle) {
        if (this.f11578b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f11578b.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.p(this.f11579c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f11579c.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f11578b.iterator();
    }
}
