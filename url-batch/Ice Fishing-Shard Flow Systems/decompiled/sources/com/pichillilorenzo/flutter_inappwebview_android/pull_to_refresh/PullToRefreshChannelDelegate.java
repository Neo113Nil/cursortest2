package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import S.j;
import android.graphics.Color;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.util.HashMap;
import s4.n;
import s4.p;
import s4.q;

/* loaded from: classes.dex */
public class PullToRefreshChannelDelegate extends ChannelDelegateImpl {
    private PullToRefreshLayout pullToRefreshView;

    public PullToRefreshChannelDelegate(PullToRefreshLayout pullToRefreshLayout, q qVar) {
        super(qVar);
        this.pullToRefreshView = pullToRefreshLayout;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.pullToRefreshView = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        char c7;
        String str = nVar.f7767a;
        str.getClass();
        switch (str.hashCode()) {
            case -1790841290:
                if (str.equals("setSlingshotDistance")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 154556713:
                if (str.equals("setRefreshing")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 1235582893:
                if (str.equals("getDefaultSlingshotDistance")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 1364071551:
                if (str.equals("setEnabled")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 1389555745:
                if (str.equals("setColor")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 1743806995:
                if (str.equals("setBackgroundColor")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case 1807783361:
                if (str.equals("setDistanceToTriggerSync")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case 1849446385:
                if (str.equals("isRefreshing")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case 1984958339:
                if (str.equals("setSize")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case 2105594551:
                if (str.equals("isEnabled")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case 0:
                if (this.pullToRefreshView == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setSlingshotDistance(((Integer) nVar.a("slingshotDistance")).intValue());
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case 1:
                if (this.pullToRefreshView == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setRefreshing(((Boolean) nVar.a("refreshing")).booleanValue());
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case 2:
                pVar.success(-1);
                break;
            case 3:
                if (this.pullToRefreshView == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    Boolean bool = (Boolean) nVar.a("enabled");
                    PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshView;
                    pullToRefreshLayout.settings.enabled = bool;
                    pullToRefreshLayout.setEnabled(bool.booleanValue());
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case 4:
                if (this.pullToRefreshView == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setColorSchemeColors(Color.parseColor((String) nVar.a("color")));
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case 5:
                if (this.pullToRefreshView == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setProgressBackgroundColorSchemeColor(Color.parseColor((String) nVar.a("color")));
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case 6:
                if (this.pullToRefreshView == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setDistanceToTriggerSync(((Integer) nVar.a("distanceToTriggerSync")).intValue());
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshView;
                pVar.success(Boolean.valueOf(pullToRefreshLayout2 != null && pullToRefreshLayout2.isRefreshing()));
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                if (this.pullToRefreshView == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setSize(((Integer) nVar.a("size")).intValue());
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case '\t':
                PullToRefreshLayout pullToRefreshLayout3 = this.pullToRefreshView;
                if (pullToRefreshLayout3 == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    pVar.success(Boolean.valueOf(pullToRefreshLayout3.isEnabled()));
                    break;
                }
            default:
                pVar.notImplemented();
                break;
        }
    }

    public void onRefresh() {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onRefresh", new HashMap(), null);
    }
}
