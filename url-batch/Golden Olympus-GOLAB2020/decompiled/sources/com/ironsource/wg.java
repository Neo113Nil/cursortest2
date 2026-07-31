package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class wg extends FrameLayout implements wh {

    /* renamed from: b, reason: collision with root package name */
    private static final String f20194b = "IronSourceAdContainer";

    /* renamed from: a, reason: collision with root package name */
    private bh f20195a;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f20196a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20197b;

        a(String str, String str2) {
            this.f20196a = str;
            this.f20197b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            wg wgVar = wg.this;
            wgVar.removeView(wgVar.f20195a.getPresentingView());
            wg.this.f20195a.a(this.f20196a, this.f20197b);
            wg.this.f20195a = null;
        }
    }

    public wg(Context context) {
        super(context);
    }

    private void b() {
        JSONObject jSONObject;
        try {
            jSONObject = this.f20195a.c().a().getJSONObject(vg.f20048p).getJSONObject(vg.f20051s);
        } catch (Exception e4) {
            o9.d().a(e4);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f20195a.b());
        this.f20195a.c().a(b9.g.f15390S, jSONObject);
    }

    @Override // com.ironsource.wh
    public void c(JSONObject jSONObject, String str, String str2) {
        this.f20195a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.wh
    public WebView getPresentingView() {
        return this.f20195a.getPresentingView();
    }

    public ug getSize() {
        bh bhVar = this.f20195a;
        return bhVar != null ? bhVar.d() : new ug();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i4) {
        Logger.i(f20194b, "onVisibilityChanged: " + i4);
        bh bhVar = this.f20195a;
        if (bhVar == null) {
            return;
        }
        try {
            bhVar.c().a(vg.f20043k, i4, isShown());
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        Logger.i(f20194b, "onWindowVisibilityChanged: " + i4);
        bh bhVar = this.f20195a;
        if (bhVar == null) {
            return;
        }
        try {
            bhVar.c().a(vg.f20044l, i4, isShown());
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public wg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ironsource.wh
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f20195a.b(jSONObject, str, str2);
    }

    public wg(bh bhVar, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(bhVar.d().c(), bhVar.d().a()));
        this.f20195a = bhVar;
        addView(bhVar.getPresentingView());
    }

    public void a() {
        bh bhVar = this.f20195a;
        if (bhVar == null || bhVar.c() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.ironsource.wh
    public synchronized void a(String str, String str2) {
        bh bhVar = this.f20195a;
        if (bhVar != null && bhVar.c() != null && this.f20195a.getPresentingView() != null) {
            this.f20195a.c().e();
            ig.f16710a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.wh
    public void a(String str, String str2, String str3) {
        bh bhVar = this.f20195a;
        if (bhVar == null) {
            return;
        }
        bhVar.a(str, str2, str3);
    }

    @Override // com.ironsource.wh
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f20195a.a(jSONObject, str, str2);
    }
}
