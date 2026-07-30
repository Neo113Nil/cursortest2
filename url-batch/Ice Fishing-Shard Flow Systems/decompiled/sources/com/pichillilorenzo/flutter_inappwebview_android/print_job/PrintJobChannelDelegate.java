package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
import s4.n;
import s4.p;
import s4.q;

/* loaded from: classes.dex */
public class PrintJobChannelDelegate extends ChannelDelegateImpl {
    private PrintJobController printJobController;

    public PrintJobChannelDelegate(PrintJobController printJobController, q qVar) {
        super(qVar);
        this.printJobController = printJobController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.printJobController = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        String str = nVar.f7767a;
        str.getClass();
        switch (str) {
            case "cancel":
                PrintJobController printJobController = this.printJobController;
                if (printJobController == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    printJobController.cancel();
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case "getInfo":
                PrintJobController printJobController2 = this.printJobController;
                if (printJobController2 == null) {
                    pVar.success(null);
                    break;
                } else {
                    PrintJobInfoExt info = printJobController2.getInfo();
                    pVar.success(info != null ? info.toMap() : null);
                    break;
                }
            case "restart":
                PrintJobController printJobController3 = this.printJobController;
                if (printJobController3 == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    printJobController3.restart();
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case "dispose":
                PrintJobController printJobController4 = this.printJobController;
                if (printJobController4 == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    printJobController4.dispose();
                    pVar.success(Boolean.TRUE);
                    break;
                }
            default:
                pVar.notImplemented();
                break;
        }
    }
}
