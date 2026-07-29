package com.dancingbogo.skyrolline.webview.ui;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.dancingbogo.skyrolline.R;
import com.dancingbogo.skyrolline.util.l;
import com.dancingbogo.skyrolline.webview.util.NetStatReceiver;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public class MsgBoxNetworkStateViewFlipper extends b {

    /* renamed from: a, reason: collision with root package name */
    private NetStatReceiver f4642a;

    /* renamed from: b, reason: collision with root package name */
    private a f4643b;

    /* renamed from: c, reason: collision with root package name */
    private View f4644c;

    /* renamed from: d, reason: collision with root package name */
    private View f4645d;
    private View e;
    private LoadingView f;

    public MsgBoxNetworkStateViewFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4642a = null;
        this.f4643b = null;
        LayoutInflater.from(context).inflate(R.layout.message_tag_network_viewflip_layout, this);
        f();
        this.f4644c.setOnClickListener(new View.OnClickListener() { // from class: com.dancingbogo.skyrolline.webview.ui.MsgBoxNetworkStateViewFlipper.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsgBoxNetworkStateViewFlipper.this.n();
            }
        });
        this.f4645d.setOnClickListener(new View.OnClickListener() { // from class: com.dancingbogo.skyrolline.webview.ui.MsgBoxNetworkStateViewFlipper.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsgBoxNetworkStateViewFlipper.this.m();
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.dancingbogo.skyrolline.webview.ui.MsgBoxNetworkStateViewFlipper.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsgBoxNetworkStateViewFlipper.this.n();
            }
        });
    }

    private void f() {
        this.f4644c = findViewById(R.id.btn_open_wifi);
        this.f4645d = findViewById(R.id.btn_retry);
        this.e = findViewById(R.id.btn_choose_network);
        this.f = (LoadingView) findViewById(R.id.loading_view);
    }

    public void setLoadingText(String str) {
        this.f.setLoadingText(str);
    }

    public void setRequestLoadCB(a aVar) {
        this.f4643b = aVar;
    }

    @Override // com.dancingbogo.skyrolline.webview.ui.b, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        h();
        super.onDetachedFromWindow();
    }

    private void g() {
        this.f4642a = new NetStatReceiver(getContext());
        this.f4642a.a(new NetStatReceiver.a() { // from class: com.dancingbogo.skyrolline.webview.ui.MsgBoxNetworkStateViewFlipper.4
            @Override // com.dancingbogo.skyrolline.webview.util.NetStatReceiver.a
            public void a() {
                MsgBoxNetworkStateViewFlipper.this.j();
            }

            @Override // com.dancingbogo.skyrolline.webview.util.NetStatReceiver.a
            public void b() {
                MsgBoxNetworkStateViewFlipper.this.l();
            }

            @Override // com.dancingbogo.skyrolline.webview.util.NetStatReceiver.a
            public void c() {
                MsgBoxNetworkStateViewFlipper.this.h();
                if (MsgBoxNetworkStateViewFlipper.this.f4643b != null) {
                    MsgBoxNetworkStateViewFlipper.this.f4643b.a();
                }
            }

            @Override // com.dancingbogo.skyrolline.webview.util.NetStatReceiver.a
            public void d() {
                MsgBoxNetworkStateViewFlipper.this.h();
                MsgBoxNetworkStateViewFlipper.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (getContext() == null || this.f4642a == null) {
            return;
        }
        try {
            try {
                getContext().unregisterReceiver(this.f4642a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.f4642a = null;
        }
    }

    private boolean getWifiEnabled() {
        return ((WifiManager) getContext().getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI)).isWifiEnabled();
    }

    protected void a() {
        setDisplayedChild(1);
    }

    protected void b() {
        setDisplayedChild(2);
    }

    protected void c() {
        setDisplayedChild(3);
    }

    public void d() {
        setDisplayedChild(0);
    }

    public void e() {
        if (getContext() == null) {
            return;
        }
        if (this.f4642a == null) {
            g();
        }
        if (l.f(getContext())) {
            i();
        } else if (getWifiEnabled()) {
            k();
        } else {
            j();
        }
    }

    private void i() {
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        b();
    }

    private void k() {
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (l.f(getContext())) {
            d();
            if (this.f4643b != null) {
                this.f4643b.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        if (getContext() == null) {
            return false;
        }
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        intent.setFlags(268435456);
        getContext().startActivity(intent);
        return false;
    }
}
