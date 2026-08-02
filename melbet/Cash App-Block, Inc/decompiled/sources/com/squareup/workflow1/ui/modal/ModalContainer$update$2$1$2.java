package com.squareup.workflow1.ui.modal;

import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.emoji2.text.MetadataRepo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.media3.extractor.VorbisUtil$Mode;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import com.google.android.filament.Box;
import com.google.maps.android.compose.clustering.ComposeUiClusterRenderer;
import com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView;
import com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner;
import com.squareup.workflow1.ui.modal.ModalContainer;
import com.withpersona.sdk2.camera.CameraPreview$rebind$1$1$1;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes9.dex */
public final class ModalContainer$update$2$1$2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final Object dismissOnDestroy;
    public Object lifecycle;
    public final /* synthetic */ Object this$0;

    public ModalContainer$update$2$1$2(ModalContainer.DialogRef dialogRef, ModalContainer modalContainer) {
        this.$r8$classId = 0;
        this.this$0 = modalContainer;
        this.dismissOnDestroy = new CameraPreview$rebind$1$1$1(dialogRef, 3);
    }

    private final void onViewDetachedFromWindow$com$google$maps$android$compose$clustering$ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$invokeSuspend$$inlined$doOnAttach$1(View view) {
    }

    private final void onViewDetachedFromWindow$com$squareup$cash$directory_ui$views$MooncakeFlatRowItemView$setModel$$inlined$doOnAttach$1(View view) {
    }

    private final void onViewDetachedFromWindow$com$squareup$cash$util$BackHandlerKt$setBackHandler$$inlined$doOnAttach$1(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        Object obj2 = this.dismissOnDestroy;
        switch (i) {
            case 0:
                view.getClass();
                LifecycleRegistry lifecycleRegistry = ((RealWorkflowLifecycleOwner) ((ModalContainer) obj).parentLifecycleOwner$delegate.getValue()).localLifecycle;
                lifecycleRegistry.addObserver((CameraPreview$rebind$1$1$1) obj2);
                this.lifecycle = lifecycleRegistry;
                break;
            case 1:
                view.getClass();
                View view2 = (View) this.lifecycle;
                ((MetadataRepo) obj2).registerOnDrawListener(view2, (Box) obj);
                view2.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ComposeUiClusterRenderer.InvalidatingComposeView invalidatingComposeView = (ComposeUiClusterRenderer.InvalidatingComposeView) this.lifecycle;
                ProducerScope producerScope = (ProducerScope) obj;
                if (!invalidatingComposeView.isAttachedToWindow()) {
                    ((ProducerCoroutine) producerScope).close(null);
                    break;
                } else {
                    invalidatingComposeView.addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(2, invalidatingComposeView, producerScope));
                    break;
                }
            case 3:
                ((MooncakeFlatRowItemView) obj2).removeOnAttachStateChangeListener(this);
                DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) this.lifecycle;
                Ui.EventReceiver eventReceiver = (Ui.EventReceiver) obj;
                itemViewModel.getClass();
                VorbisUtil$Mode vorbisUtil$Mode = itemViewModel.$$delegate_0;
                vorbisUtil$Mode.getClass();
                if (!vorbisUtil$Mode.blockFlag) {
                    eventReceiver.sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.AnalyticsEvent(DirectoryAnalyticsData.copy$default(itemViewModel.analyticsData, null, null, DirectoryAnalyticsData.EventType.VIEW_PROFILE_DIRECTORY_ITEM, 447)));
                    vorbisUtil$Mode.blockFlag = true;
                    break;
                }
                break;
            default:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                View view3 = (View) this.lifecycle;
                LifecycleOwner lifecycleOwner = DBUtil.get(view3);
                lifecycleOwner.getClass();
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = Trace.get(view3);
                onBackPressedDispatcherOwner.getClass();
                onBackPressedDispatcherOwner.getOnBackPressedDispatcher().addCallback((RedwoodLayoutKt$toAndroid$1) obj, lifecycleOwner);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$r8$classId) {
            case 0:
                view.getClass();
                LifecycleRegistry lifecycleRegistry = (LifecycleRegistry) this.lifecycle;
                if (lifecycleRegistry != null) {
                    lifecycleRegistry.removeObserver((CameraPreview$rebind$1$1$1) this.dismissOnDestroy);
                }
                this.lifecycle = null;
                break;
            case 1:
                view.getClass();
                break;
        }
    }

    public /* synthetic */ ModalContainer$update$2$1$2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.dismissOnDestroy = obj;
        this.lifecycle = obj2;
        this.this$0 = obj3;
    }
}
