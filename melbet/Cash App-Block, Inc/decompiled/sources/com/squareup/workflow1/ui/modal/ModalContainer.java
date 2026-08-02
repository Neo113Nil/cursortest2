package com.squareup.workflow1.ui.modal;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.util.DBUtil;
import androidx.savedstate.SavedStateRegistryOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zznf;
import com.squareup.cash.R;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import com.squareup.workflow1.ui.Compatible;
import com.squareup.workflow1.ui.CompatibleKt;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.WorkflowViewState;
import com.squareup.workflow1.ui.WorkflowViewStateKt;
import com.squareup.workflow1.ui.WorkflowViewStub;
import com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.internal.e3;
import org.slf4j.Marker;

/* loaded from: classes8.dex */
public abstract class ModalContainer extends FrameLayout {
    public final WorkflowViewStub baseViewStub;
    public List dialogs;
    public final Lazy parentLifecycleOwner$delegate;
    public final MarkwonConfiguration stateRegistryAggregator;

    public final class DialogRef {
        public final Dialog dialog;
        public final Object extra;
        public final Object modalRendering;
        public String savedStateRegistryKey;
        public final ViewEnvironment viewEnvironment;

        public DialogRef(Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2) {
            obj.getClass();
            viewEnvironment.getClass();
            dialog.getClass();
            this.modalRendering = obj;
            this.viewEnvironment = viewEnvironment;
            this.dialog = dialog;
            this.extra = obj2;
        }

        public final void dismiss$wf1_container_android() {
            Dialog dialog = this.dialog;
            Window window = dialog.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            if (decorView != null) {
                LifecycleOwner lifecycleOwner = DBUtil.get(decorView);
                RealWorkflowLifecycleOwner realWorkflowLifecycleOwner = lifecycleOwner instanceof RealWorkflowLifecycleOwner ? (RealWorkflowLifecycleOwner) lifecycleOwner : null;
                if (realWorkflowLifecycleOwner != null) {
                    realWorkflowLifecycleOwner.destroyOnDetach();
                }
            }
            dialog.dismiss();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!DialogRef.class.equals(obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                return Intrinsics.areEqual(this.dialog, ((DialogRef) obj).dialog);
            }
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.ModalContainer.DialogRef<*>");
            return false;
        }

        public final int hashCode() {
            return this.dialog.hashCode();
        }
    }

    public final class KeyAndBundle implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR();
        public final Bundle bundle;
        public final String compatibilityKey;

        public final class CREATOR implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                String m = NavAction$$ExternalSyntheticOutline0.m(parcel);
                Bundle readBundle = parcel.readBundle(KeyAndBundle.class.getClassLoader());
                readBundle.getClass();
                return new KeyAndBundle(readBundle, m);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KeyAndBundle[i];
            }
        }

        public KeyAndBundle(Bundle bundle, String str) {
            bundle.getClass();
            this.compatibilityKey = str;
            this.bundle = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeyAndBundle)) {
                return false;
            }
            KeyAndBundle keyAndBundle = (KeyAndBundle) obj;
            return this.compatibilityKey.equals(keyAndBundle.compatibilityKey) && Intrinsics.areEqual(this.bundle, keyAndBundle.bundle);
        }

        public final int hashCode() {
            return this.bundle.hashCode() + (this.compatibilityKey.hashCode() * 31);
        }

        public final String toString() {
            return "KeyAndBundle(compatibilityKey=" + this.compatibilityKey + ", bundle=" + this.bundle + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.compatibilityKey);
            parcel.writeBundle(this.bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        context.getClass();
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 0, 0, 14, null);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.baseViewStub = workflowViewStub;
        this.dialogs = EmptyList.INSTANCE;
        this.parentLifecycleOwner$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e3(this, 8));
        this.stateRegistryAggregator = new MarkwonConfiguration(18);
    }

    public abstract DialogRef buildDialog(Object obj, ViewEnvironment viewEnvironment);

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SavedStateRegistryOwner stateRegistryOwnerFromViewTreeOrContext = zznf.stateRegistryOwnerFromViewTreeOrContext(this);
        WorkflowViewState workflowViewStateOrNull = WorkflowViewStateKt.getWorkflowViewStateOrNull(this);
        Object showing = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowing();
        if (showing == null) {
            showing = null;
        }
        showing.getClass();
        Compatible compatible = showing instanceof Compatible ? (Compatible) showing : null;
        String compatibilityKey = compatible != null ? compatible.getCompatibilityKey() : null;
        if (compatibilityKey == null) {
            compatibilityKey = showing.getClass().getName();
        }
        this.stateRegistryAggregator.attachToParentRegistry(Intrinsics.stringPlus("", compatibilityKey), stateRegistryOwnerFromViewTreeOrContext);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.stateRegistryAggregator.detachFromParentRegistry();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        Unit unit = null;
        SavedState savedState = parcelable instanceof SavedState ? (SavedState) parcelable : null;
        if (savedState != null) {
            ArrayList arrayList = savedState.dialogBundles;
            if (arrayList.size() == this.dialogs.size()) {
                List list = this.dialogs;
                Iterator it = arrayList.iterator();
                Iterator it2 = list.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    Object next = it.next();
                    DialogRef dialogRef = (DialogRef) it2.next();
                    KeyAndBundle keyAndBundle = (KeyAndBundle) next;
                    dialogRef.getClass();
                    keyAndBundle.getClass();
                    Object obj = dialogRef.modalRendering;
                    obj.getClass();
                    Compatible compatible = obj instanceof Compatible ? (Compatible) obj : null;
                    String compatibilityKey = compatible == null ? null : compatible.getCompatibilityKey();
                    if (compatibilityKey == null) {
                        compatibilityKey = obj.getClass().getName();
                    }
                    if (Intrinsics.stringPlus("", compatibilityKey).equals(keyAndBundle.compatibilityKey)) {
                        Window window = dialogRef.dialog.getWindow();
                        window.getClass();
                        window.restoreHierarchyState(keyAndBundle.bundle);
                    }
                    arrayList2.add(Unit.INSTANCE);
                }
            }
            super.onRestoreInstanceState(((SavedState) parcelable).getSuperState());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        List<DialogRef> list = this.dialogs;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (DialogRef dialogRef : list) {
            Window window = dialogRef.dialog.getWindow();
            window.getClass();
            Bundle saveHierarchyState = window.saveHierarchyState();
            Object obj = dialogRef.modalRendering;
            obj.getClass();
            Compatible compatible = obj instanceof Compatible ? (Compatible) obj : null;
            String compatibilityKey = compatible != null ? compatible.getCompatibilityKey() : null;
            if (compatibilityKey == null) {
                compatibilityKey = obj.getClass().getName();
            }
            String stringPlus = Intrinsics.stringPlus("", compatibilityKey);
            saveHierarchyState.getClass();
            arrayList.add(new KeyAndBundle(saveHierarchyState, stringPlus));
        }
        return new SavedState(onSaveInstanceState, arrayList);
    }

    public final void update(HasModals hasModals, ViewEnvironment viewEnvironment) {
        DialogRef buildDialog;
        hasModals.getClass();
        viewEnvironment.getClass();
        this.baseViewStub.update(hasModals.getBeneathModals(), viewEnvironment);
        ArrayList arrayList = new ArrayList();
        Iterator it = hasModals.getModals().iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            MarkwonConfiguration markwonConfiguration = this.stateRegistryAggregator;
            if (!hasNext) {
                Iterator it2 = CollectionsKt.minus((Iterable) this.dialogs, (Iterable) arrayList).iterator();
                while (it2.hasNext()) {
                    ((DialogRef) it2.next()).dismiss$wf1_container_android();
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str = ((DialogRef) it3.next()).savedStateRegistryKey;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("savedStateRegistryKey");
                        throw null;
                    }
                    arrayList2.add(str);
                }
                markwonConfiguration.pruneAllChildRegistryOwnersExcept(arrayList2);
                this.dialogs = arrayList;
                return;
            }
            int i2 = i + 1;
            Object next = it.next();
            if (i >= this.dialogs.size() || !CompatibleKt.compatible(((DialogRef) this.dialogs.get(i)).modalRendering, next)) {
                buildDialog = buildDialog(next, viewEnvironment);
                String valueOf = String.valueOf(i);
                next.getClass();
                valueOf.getClass();
                Compatible compatible = next instanceof Compatible ? (Compatible) next : null;
                String compatibilityKey = compatible == null ? null : compatible.getCompatibilityKey();
                if (compatibilityKey == null) {
                    compatibilityKey = next.getClass().getName();
                }
                String stringPlus = Intrinsics.stringPlus(valueOf.length() == 0 ? "" : Intrinsics.stringPlus(valueOf, Marker.ANY_NON_NULL_MARKER), compatibilityKey);
                Dialog dialog = buildDialog.dialog;
                buildDialog.savedStateRegistryKey = stringPlus;
                Window window = dialog.getWindow();
                View decorView = window == null ? null : window.getDecorView();
                if (decorView != null) {
                    RealWorkflowLifecycleOwner realWorkflowLifecycleOwner = new RealWorkflowLifecycleOwner(new InterceptedRenderContext$send$1(this, 6));
                    decorView.setTag(R.id.view_tree_lifecycle_owner, realWorkflowLifecycleOwner);
                    decorView.addOnAttachStateChangeListener(realWorkflowLifecycleOwner);
                    String str2 = buildDialog.savedStateRegistryKey;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("savedStateRegistryKey");
                        throw null;
                    }
                    markwonConfiguration.installChildRegistryOwnerOn(decorView, str2);
                    decorView.addOnAttachStateChangeListener(new ModalContainer$update$2$1$2(buildDialog, this));
                }
                dialog.show();
            } else {
                DialogRef dialogRef = (DialogRef) this.dialogs.get(i);
                Dialog dialog2 = dialogRef.dialog;
                Object obj = dialogRef.extra;
                dialog2.getClass();
                buildDialog = new DialogRef(next, viewEnvironment, dialog2, obj);
                String str3 = dialogRef.savedStateRegistryKey;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savedStateRegistryKey");
                    throw null;
                }
                buildDialog.savedStateRegistryKey = str3;
                updateDialog(buildDialog);
            }
            arrayList.add(buildDialog);
            i = i2;
        }
    }

    public abstract void updateDialog(DialogRef dialogRef);

    public final class SavedState extends View.BaseSavedState {
        public static final CREATOR CREATOR = new CREATOR();
        public final ArrayList dialogBundles;

        public final class CREATOR implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, KeyAndBundle.CREATOR);
            this.dialogBundles = arrayList;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            super.writeToParcel(parcel, i);
            parcel.writeTypedList(this.dialogBundles);
        }

        public SavedState(Parcelable parcelable, ArrayList arrayList) {
            super(parcelable);
            this.dialogBundles = arrayList;
        }
    }
}
