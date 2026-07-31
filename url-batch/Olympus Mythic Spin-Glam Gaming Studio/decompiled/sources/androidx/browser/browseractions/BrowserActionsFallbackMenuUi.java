package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.R;
import androidx.core.widget.TextViewCompat;
import java.util.List;

@Deprecated
/* loaded from: classes9.dex */
class BrowserActionsFallbackMenuUi implements AdapterView.OnItemClickListener {
    private BrowserActionsFallbackMenuDialog mBrowserActionsDialog;
    final Context mContext;
    private final List mMenuItems;
    BrowserActionsFallMenuUiListener mMenuUiListener;
    final Uri mUri;

    @RestrictTo
    @VisibleForTesting
    interface BrowserActionsFallMenuUiListener {
        void onMenuShown(View view);
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ BrowserActionsFallbackMenuUi this$0;

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) this.this$0.mContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", this.this$0.mUri.toString()));
            Toast.makeText(this.this$0.mContext, this.this$0.mContext.getString(R.string.copy_toast_msg), 0).show();
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$2, reason: invalid class name */
    /* loaded from: classes12.dex */
    class AnonymousClass2 implements DialogInterface.OnShowListener {
        final /* synthetic */ BrowserActionsFallbackMenuUi this$0;
        final /* synthetic */ View val$view;

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            BrowserActionsFallMenuUiListener browserActionsFallMenuUiListener = this.this$0.mMenuUiListener;
            if (browserActionsFallMenuUiListener == null) {
                Log.e("BrowserActionskMenuUi", "Cannot trigger menu item listener, it is null");
            } else {
                browserActionsFallMenuUiListener.onMenuShown(this.val$view);
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$3, reason: invalid class name */
    /* loaded from: classes12.dex */
    class AnonymousClass3 implements View.OnClickListener {
        final /* synthetic */ TextView val$urlTextView;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextViewCompat.getMaxLines(this.val$urlTextView) == Integer.MAX_VALUE) {
                this.val$urlTextView.setMaxLines(1);
                this.val$urlTextView.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.val$urlTextView.setMaxLines(Integer.MAX_VALUE);
                this.val$urlTextView.setEllipsize(null);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        BrowserActionItem browserActionItem = (BrowserActionItem) this.mMenuItems.get(i);
        if (browserActionItem.getAction() != null) {
            try {
                browserActionItem.getAction().send();
            } catch (PendingIntent.CanceledException e) {
                Log.e("BrowserActionskMenuUi", "Failed to send custom item action", e);
            }
        } else if (browserActionItem.getRunnableAction() != null) {
            browserActionItem.getRunnableAction().run();
        }
        BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog = this.mBrowserActionsDialog;
        if (browserActionsFallbackMenuDialog == null) {
            Log.e("BrowserActionskMenuUi", "Cannot dismiss dialog, it has already been dismissed.");
        } else {
            browserActionsFallbackMenuDialog.dismiss();
        }
    }
}
