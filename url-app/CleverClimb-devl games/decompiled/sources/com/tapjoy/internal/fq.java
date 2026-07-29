package com.tapjoy.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.internal.ft;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

/* loaded from: classes2.dex */
public final class fq extends gu implements Observer {

    /* renamed from: d, reason: collision with root package name */
    private boolean f8122d;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8120b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final fj f8121c = new fj();
    private final ga e = new ga() { // from class: com.tapjoy.internal.fq.1
        @Override // com.tapjoy.internal.ga
        protected final /* bridge */ /* synthetic */ String a(Object obj) {
            return "AppLaunch";
        }

        @Override // com.tapjoy.internal.ga
        protected final boolean a() {
            return super.a() && !hl.c();
        }

        @Override // com.tapjoy.internal.ga
        protected final /* synthetic */ TJPlacement a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            return TJPlacementManager.createPlacement(context, "AppLaunch", true, tJPlacementListener);
        }
    };

    public static void a() {
    }

    static {
        gu.f8215a = new fq();
    }

    private fq() {
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        ft.a aVar = ft.f8131d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r3 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r5.e.c(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        if (r5.f8121c.a() != false) goto L33;
     */
    @Override // com.tapjoy.internal.gu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Activity activity) {
        Intent intent;
        ComponentName component;
        if (activity != null) {
            int taskId = activity.getTaskId();
            boolean z = false;
            if (taskId != -1 && (intent = activity.getIntent()) != null) {
                Set<String> categories = intent.getCategories();
                if ((categories != null && categories.contains("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent.getAction())) && (component = intent.getComponent()) != null) {
                    Integer num = (Integer) this.f8120b.put(component.getClassName(), Integer.valueOf(taskId));
                    if (num == null || num.intValue() != taskId) {
                        z = true;
                    }
                }
            }
        }
        if (!this.f8122d) {
        }
        this.f8122d = true;
    }
}
