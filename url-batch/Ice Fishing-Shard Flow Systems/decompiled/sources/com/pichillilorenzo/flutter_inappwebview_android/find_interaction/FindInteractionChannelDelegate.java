package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import java.util.HashMap;
import s4.n;
import s4.p;
import s4.q;

/* loaded from: classes.dex */
public class FindInteractionChannelDelegate extends ChannelDelegateImpl {
    private FindInteractionController findInteractionController;

    public FindInteractionChannelDelegate(FindInteractionController findInteractionController, q qVar) {
        super(qVar);
        this.findInteractionController = findInteractionController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.findInteractionController = null;
    }

    public void onFindResultReceived(int i2, int i5, boolean z7) {
        FindInteractionController findInteractionController;
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        if (z7 && (findInteractionController = this.findInteractionController) != null && findInteractionController.webView != null) {
            findInteractionController.activeFindSession = new FindSession(i5, i2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activeMatchOrdinal", Integer.valueOf(i2));
        hashMap.put("numberOfMatches", Integer.valueOf(i5));
        hashMap.put("isDoneCounting", Boolean.valueOf(z7));
        channel.a("onFindResultReceived", hashMap, null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        FindSession findSession;
        String str = nVar.f7767a;
        str.getClass();
        switch (str) {
            case "getSearchText":
                FindInteractionController findInteractionController = this.findInteractionController;
                if (findInteractionController == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    pVar.success(findInteractionController.searchText);
                    break;
                }
            case "findAll":
                if (this.findInteractionController != null) {
                    this.findInteractionController.findAll((String) nVar.a("find"));
                }
                pVar.success(Boolean.TRUE);
                break;
            case "findNext":
                if (this.findInteractionController != null) {
                    this.findInteractionController.findNext(((Boolean) nVar.a("forward")).booleanValue());
                }
                pVar.success(Boolean.TRUE);
                break;
            case "setSearchText":
                FindInteractionController findInteractionController2 = this.findInteractionController;
                if (findInteractionController2 == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    findInteractionController2.searchText = (String) nVar.a("searchText");
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case "clearMatches":
                FindInteractionController findInteractionController3 = this.findInteractionController;
                if (findInteractionController3 != null) {
                    findInteractionController3.clearMatches();
                }
                pVar.success(Boolean.TRUE);
                break;
            case "getActiveFindSession":
                FindInteractionController findInteractionController4 = this.findInteractionController;
                if (findInteractionController4 != null && (findSession = findInteractionController4.activeFindSession) != null) {
                    pVar.success(findSession.toMap());
                    break;
                } else {
                    pVar.success(null);
                    break;
                }
                break;
            default:
                pVar.notImplemented();
                break;
        }
    }
}
