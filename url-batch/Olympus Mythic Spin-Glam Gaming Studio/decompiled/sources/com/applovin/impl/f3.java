package com.applovin.impl;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.d;
import com.applovin.impl.e3;
import com.applovin.impl.g3;
import com.applovin.impl.s2;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes12.dex */
public abstract class f3 extends n3 {
    private g3 a;
    private ListView b;

    class a implements s2.a {
        final /* synthetic */ e3 a;

        /* renamed from: com.applovin.impl.f3$a$a, reason: collision with other inner class name */
        class C0075a implements d.b {
            C0075a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.a);
            }
        }

        a(e3 e3Var) {
            this.a = e3Var;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() != g3.a.TEST_ADS.ordinal()) {
                n7.a(r2Var.c(), r2Var.b(), f3.this);
                return;
            }
            com.applovin.impl.sdk.k o = this.a.o();
            e3.b y = this.a.y();
            if (!f3.this.a.a(j2Var)) {
                n7.a(r2Var.c(), r2Var.b(), f3.this);
                return;
            }
            if (e3.b.READY == y) {
                d.a(f3.this, MaxDebuggerMultiAdActivity.class, o.e(), new C0075a());
            } else if (e3.b.DISABLED != y) {
                n7.a(r2Var.c(), r2Var.b(), f3.this);
            } else {
                o.s0().a();
                n7.a(r2Var.c(), r2Var.b(), f3.this);
            }
        }
    }

    public f3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.n3
    protected com.applovin.impl.sdk.k getSdk() {
        g3 g3Var = this.a;
        if (g3Var != null) {
            return g3Var.h().o();
        }
        return null;
    }

    public void initialize(e3 e3Var) {
        setTitle(e3Var.g());
        g3 g3Var = new g3(e3Var, this);
        this.a = g3Var;
        g3Var.a(new a(e3Var));
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.b = listView;
        listView.setAdapter((ListAdapter) this.a);
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.a.k();
            this.a.c();
        }
    }
}
