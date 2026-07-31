package y2;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.dt2;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.zw;

/* loaded from: classes.dex */
final class m extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f23422a;

    m(s sVar) {
        this.f23422a = sVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zw zwVar;
        zw zwVar2;
        zw zwVar3;
        zw zwVar4;
        zwVar = this.f23422a.f23438l;
        if (zwVar != null) {
            try {
                zwVar2 = this.f23422a.f23438l;
                zwVar2.w(dt2.d(1, null, null));
            } catch (RemoteException e7) {
                io0.i("#007 Could not call remote method.", e7);
            }
        }
        zwVar3 = this.f23422a.f23438l;
        if (zwVar3 != null) {
            try {
                zwVar4 = this.f23422a.f23438l;
                zwVar4.D(0);
            } catch (RemoteException e8) {
                io0.i("#007 Could not call remote method.", e8);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zw zwVar;
        zw zwVar2;
        zw zwVar3;
        zw zwVar4;
        zw zwVar5;
        zw zwVar6;
        zw zwVar7;
        zw zwVar8;
        zw zwVar9;
        zw zwVar10;
        zw zwVar11;
        zw zwVar12;
        zw zwVar13;
        if (str.startsWith(this.f23422a.r())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zwVar10 = this.f23422a.f23438l;
            if (zwVar10 != null) {
                try {
                    zwVar11 = this.f23422a.f23438l;
                    zwVar11.w(dt2.d(3, null, null));
                } catch (RemoteException e7) {
                    io0.i("#007 Could not call remote method.", e7);
                }
            }
            zwVar12 = this.f23422a.f23438l;
            if (zwVar12 != null) {
                try {
                    zwVar13 = this.f23422a.f23438l;
                    zwVar13.D(3);
                } catch (RemoteException e8) {
                    io0.i("#007 Could not call remote method.", e8);
                }
            }
            this.f23422a.s6(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zwVar6 = this.f23422a.f23438l;
            if (zwVar6 != null) {
                try {
                    zwVar7 = this.f23422a.f23438l;
                    zwVar7.w(dt2.d(1, null, null));
                } catch (RemoteException e9) {
                    io0.i("#007 Could not call remote method.", e9);
                }
            }
            zwVar8 = this.f23422a.f23438l;
            if (zwVar8 != null) {
                try {
                    zwVar9 = this.f23422a.f23438l;
                    zwVar9.D(0);
                } catch (RemoteException e10) {
                    io0.i("#007 Could not call remote method.", e10);
                }
            }
            this.f23422a.s6(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zwVar4 = this.f23422a.f23438l;
            if (zwVar4 != null) {
                try {
                    zwVar5 = this.f23422a.f23438l;
                    zwVar5.h();
                } catch (RemoteException e11) {
                    io0.i("#007 Could not call remote method.", e11);
                }
            }
            this.f23422a.s6(this.f23422a.s(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zwVar = this.f23422a.f23438l;
        if (zwVar != null) {
            try {
                zwVar2 = this.f23422a.f23438l;
                zwVar2.c();
                zwVar3 = this.f23422a.f23438l;
                zwVar3.f();
            } catch (RemoteException e12) {
                io0.i("#007 Could not call remote method.", e12);
            }
        }
        s.B6(this.f23422a, s.y6(this.f23422a, str));
        return true;
    }
}
