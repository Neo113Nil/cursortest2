package com.drake.net.scope;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.drake.net.NetConfig;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.t0;

/* loaded from: classes3.dex */
public final class DialogCoroutineScope extends NetCoroutineScope implements LifecycleObserver {
    private final FragmentActivity activity;
    private final Boolean cancelable;
    private Dialog dialog;

    public /* synthetic */ DialogCoroutineScope(FragmentActivity fragmentActivity, Dialog dialog, Boolean bool, CoroutineDispatcher coroutineDispatcher, int i8, o oVar) {
        this(fragmentActivity, (i8 & 2) != 0 ? null : dialog, (i8 & 4) != 0 ? null : bool, (i8 & 8) != 0 ? t0.getMain() : coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-2, reason: not valid java name */
    public static final void m151start$lambda2(final DialogCoroutineScope this$0) {
        s.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.dialog;
        if (dialog == null) {
            dialog = NetConfig.INSTANCE.getDialogFactory().onCreate(this$0.activity);
        }
        this$0.dialog = dialog;
        Boolean bool = this$0.cancelable;
        if (bool != null) {
            dialog.setCancelable(bool.booleanValue());
        }
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.drake.net.scope.b
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                DialogCoroutineScope.m152start$lambda2$lambda1(DialogCoroutineScope.this, dialogInterface);
            }
        });
        if (this$0.activity.isFinishing()) {
            return;
        }
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-2$lambda-1, reason: not valid java name */
    public static final void m152start$lambda2$lambda1(DialogCoroutineScope this$0, DialogInterface dialogInterface) {
        s.checkNotNullParameter(this$0, "this$0");
        AndroidScope.cancel$default(this$0, null, 1, null);
    }

    @Override // com.drake.net.scope.AndroidScope
    /* renamed from: finally */
    protected void mo149finally(Throwable th) {
        super.mo149finally(th);
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final FragmentActivity getActivity() {
        return this.activity;
    }

    public final Boolean getCancelable() {
        return this.cancelable;
    }

    public final Dialog getDialog() {
        return this.dialog;
    }

    @Override // com.drake.net.scope.NetCoroutineScope
    protected void previewFinish(boolean z7) {
        Dialog dialog;
        super.previewFinish(z7);
        if (z7 && getPreviewBreakLoading() && (dialog = this.dialog) != null) {
            dialog.dismiss();
        }
    }

    public final void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    @Override // com.drake.net.scope.NetCoroutineScope
    protected void start() {
        this.activity.runOnUiThread(new Runnable() { // from class: com.drake.net.scope.a
            @Override // java.lang.Runnable
            public final void run() {
                DialogCoroutineScope.m151start$lambda2(DialogCoroutineScope.this);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogCoroutineScope(FragmentActivity activity, Dialog dialog, Boolean bool, CoroutineDispatcher dispatcher) {
        super(null, null, dispatcher, 3, null);
        s.checkNotNullParameter(activity, "activity");
        s.checkNotNullParameter(dispatcher, "dispatcher");
        this.activity = activity;
        this.dialog = dialog;
        this.cancelable = bool;
        activity.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.drake.net.scope.DialogCoroutineScope.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Dialog dialog2;
                s.checkNotNullParameter(source, "source");
                s.checkNotNullParameter(event, "event");
                if (event != Lifecycle.Event.ON_DESTROY || (dialog2 = DialogCoroutineScope.this.getDialog()) == null) {
                    return;
                }
                dialog2.cancel();
            }
        });
    }
}
