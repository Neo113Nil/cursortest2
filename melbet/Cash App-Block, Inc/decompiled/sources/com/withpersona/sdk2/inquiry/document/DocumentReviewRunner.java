package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.webkit.MimeTypeMap;
import android.widget.TextView;
import androidx.camera.video.Recorder;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.LeftSheetDelegate;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentTileAdapter;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentReviewBinding;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.ScreenRenderer;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class DocumentReviewRunner implements LayoutRunner, ScreenRenderer {
    public static final SandboxScreenRunner.Companion Companion = new SandboxScreenRunner.Companion(2);
    public final Pi2DocumentReviewBinding binding;

    public DocumentReviewRunner(Pi2DocumentReviewBinding pi2DocumentReviewBinding) {
        pi2DocumentReviewBinding.getClass();
        this.binding = pi2DocumentReviewBinding;
        CoordinatorLayout coordinatorLayout = pi2DocumentReviewBinding.rootView;
        coordinatorLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(coordinatorLayout, 15);
    }

    public final void render(final DocumentWorkflow.Screen.ReviewCaptures reviewCaptures, SystemUiController systemUiController) {
        DocumentTileAdapter documentTileAdapter;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle disclaimerStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        Integer headerButtonColorValue;
        Integer backgroundColorValue;
        boolean z;
        Iterator it;
        Object remote;
        TextView textView;
        reviewCaptures.getClass();
        Pi2DocumentReviewBinding pi2DocumentReviewBinding = this.binding;
        TextView textView2 = pi2DocumentReviewBinding.title;
        Pi2NavigationBar pi2NavigationBar = pi2DocumentReviewBinding.navigationBar;
        TextView textView3 = pi2DocumentReviewBinding.disclaimer;
        TextView textView4 = pi2DocumentReviewBinding.body;
        CoordinatorLayout coordinatorLayout = pi2DocumentReviewBinding.rootView;
        RecyclerView recyclerView = pi2DocumentReviewBinding.reviewItemList;
        PersonaMaterialButton personaMaterialButton = pi2DocumentReviewBinding.submitButton;
        String str = reviewCaptures.title;
        StepStyles.DocumentStepStyle documentStepStyle = reviewCaptures.styles;
        textView2.setText(str);
        String str2 = reviewCaptures.prompt;
        if (str2 != null) {
            MarkwonImpl create = MarkwonImpl.create(coordinatorLayout.getContext());
            create.setParsedMarkdown(textView4, create.toMarkdown(str2));
        }
        textView3.setText(reviewCaptures.disclaimer);
        RecyclerView.Adapter adapter = recyclerView.mAdapter;
        if (adapter == null) {
            Context context = coordinatorLayout.getContext();
            context.getClass();
            documentTileAdapter = new DocumentTileAdapter(context, reviewCaptures.imageLoader, reviewCaptures.openUploadOptions, documentStepStyle);
            recyclerView.setAdapter(documentTileAdapter);
        } else {
            documentTileAdapter = (DocumentTileAdapter) adapter;
        }
        boolean z2 = !reviewCaptures.disabled && reviewCaptures.addButtonEnabled;
        List list = reviewCaptures.documents;
        list.getClass();
        final ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            DocumentFile documentFile = (DocumentFile) it2.next();
            if (documentFile instanceof DocumentFile.Local) {
                DocumentFile.Local local = (DocumentFile.Local) documentFile;
                File file = new File(local.absoluteFilePath);
                z = z2;
                it = it2;
                remote = new DocumentTileAdapter.Item.DocumentItem.Local(file, local, MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt__UtilsKt.getExtension(file)));
                textView = textView3;
            } else {
                z = z2;
                it = it2;
                if (!(documentFile instanceof DocumentFile.Remote)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                DocumentFile.Remote remote2 = (DocumentFile.Remote) documentFile;
                String str3 = remote2.remoteUrl;
                textView = textView3;
                remote = new DocumentTileAdapter.Item.DocumentItem.Remote(str3, remote2.filename, remote2, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3)));
            }
            arrayList.add(remote);
            z2 = z;
            it2 = it;
            textView3 = textView;
        }
        TextView textView5 = textView3;
        if (z2) {
            arrayList.add(new DocumentTileAdapter.Item.AddButtonItem());
        }
        final List list2 = documentTileAdapter.items;
        Recorder.SetupVideoTask calculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: com.withpersona.sdk2.inquiry.document.DocumentTileAdapter$update$diff$1
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final boolean areContentsTheSame(int i, int i2) {
                DocumentTileAdapter.Item item = (DocumentTileAdapter.Item) list2.get(i);
                DocumentTileAdapter.Item item2 = (DocumentTileAdapter.Item) arrayList.get(i2);
                if (areItemsTheSame(i, i2)) {
                    if (item instanceof DocumentTileAdapter.Item.AddButtonItem) {
                        if (item == item2) {
                            return true;
                        }
                    } else {
                        if (item instanceof DocumentTileAdapter.Item.DocumentItem) {
                            return true;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final boolean areItemsTheSame(int i, int i2) {
                DocumentTileAdapter.Item item = (DocumentTileAdapter.Item) list2.get(i);
                DocumentTileAdapter.Item item2 = (DocumentTileAdapter.Item) arrayList.get(i2);
                if (item.getClass() != item2.getClass()) {
                    return false;
                }
                if (item instanceof DocumentTileAdapter.Item.AddButtonItem) {
                    return true;
                }
                if (item instanceof DocumentTileAdapter.Item.DocumentItem.Local) {
                    return Intrinsics.areEqual(((DocumentTileAdapter.Item.DocumentItem.Local) item).file.getAbsolutePath(), ((DocumentTileAdapter.Item.DocumentItem.Local) item2).file.getAbsolutePath());
                }
                if (item instanceof DocumentTileAdapter.Item.DocumentItem.Remote) {
                    return Intrinsics.areEqual(((DocumentTileAdapter.Item.DocumentItem.Remote) item).remoteUrl, ((DocumentTileAdapter.Item.DocumentItem.Remote) item2).remoteUrl);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final int getNewListSize() {
                return arrayList.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final int getOldListSize() {
                return list2.size();
            }
        });
        documentTileAdapter.items = arrayList;
        calculateDiff.dispatchUpdatesTo(new OpReorderer(documentTileAdapter));
        List list3 = list2;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Object obj : list3) {
            linkedHashMap.put(obj, (DocumentTileAdapter.Item) obj);
        }
        Iterator it3 = CollectionsKt.withIndex(arrayList).iterator();
        while (true) {
            ArrayIterator arrayIterator = (ArrayIterator) it3;
            if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
            int i = indexedValue.index;
            DocumentTileAdapter.Item item = (DocumentTileAdapter.Item) indexedValue.value;
            DocumentTileAdapter.Item item2 = (DocumentTileAdapter.Item) linkedHashMap.get(item);
            if ((item2 instanceof DocumentTileAdapter.Item.DocumentItem.Local) && (item instanceof DocumentTileAdapter.Item.DocumentItem.Local)) {
                int i2 = ((DocumentTileAdapter.Item.DocumentItem.Local) item2).document.uploadProgress;
                int i3 = ((DocumentTileAdapter.Item.DocumentItem.Local) item).document.uploadProgress;
                if (i2 != i3) {
                    if (i3 == 100) {
                        documentTileAdapter.notifyItemChanged(i);
                    } else {
                        documentTileAdapter.notifyItemChanged(i, Unit.INSTANCE);
                    }
                }
            }
        }
        documentTileAdapter.removeDocument = new HCaptcha$$ExternalSyntheticLambda2(reviewCaptures, 8);
        personaMaterialButton.setText(reviewCaptures.submitButtonText);
        personaMaterialButton.setEnabled(reviewCaptures.submitButtonEnabled);
        personaMaterialButton.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(reviewCaptures, 12));
        NavigationState navigationState = reviewCaptures.navigationState;
        final int i4 = 0;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentReviewRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                DocumentWorkflow.Screen.ReviewCaptures reviewCaptures2 = reviewCaptures;
                switch (i5) {
                    case 0:
                        reviewCaptures2.onBack.invoke();
                        break;
                    default:
                        reviewCaptures2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i5 = 1;
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentReviewRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i52 = i5;
                DocumentWorkflow.Screen.ReviewCaptures reviewCaptures2 = reviewCaptures;
                switch (i52) {
                    case 0:
                        reviewCaptures2.onBack.invoke();
                        break;
                    default:
                        reviewCaptures2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        coordinatorLayout.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, coordinatorLayout);
        coordinatorLayout.getClass();
        LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout, reviewCaptures.error, reviewCaptures.onErrorDismissed, personaMaterialButton, 4, 10000);
        if (documentStepStyle != null && (backgroundColorValue = documentStepStyle.getBackgroundColorValue()) != null) {
            int intValue = backgroundColorValue.intValue();
            coordinatorLayout.setBackgroundColor(intValue);
            if (systemUiController != null) {
                Context context2 = coordinatorLayout.getContext();
                context2.getClass();
                systemUiController.updateSystemUiColor(context2, intValue);
            }
        }
        if (documentStepStyle != null) {
            Context context3 = coordinatorLayout.getContext();
            context3.getClass();
            Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(documentStepStyle, context3);
            if (backgroundImageDrawable != null) {
                coordinatorLayout.setBackground(backgroundImageDrawable);
            }
        }
        if (documentStepStyle != null && (headerButtonColorValue = documentStepStyle.getHeaderButtonColorValue()) != null) {
            pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
        }
        if (documentStepStyle != null && (titleStyleValue = documentStepStyle.getTitleStyleValue()) != null) {
            TextStylingKt.style(pi2DocumentReviewBinding.title, titleStyleValue, EmptySet.INSTANCE);
        }
        if (documentStepStyle != null && (textStyleValue = documentStepStyle.getTextStyleValue()) != null) {
            TextStylingKt.style(textView4, textStyleValue, EmptySet.INSTANCE);
        }
        if (documentStepStyle != null && (disclaimerStyleValue = documentStepStyle.getDisclaimerStyleValue()) != null) {
            TextStylingKt.style(textView5, disclaimerStyleValue, EmptySet.INSTANCE);
        }
        if (documentStepStyle == null || (buttonPrimaryStyleValue = documentStepStyle.getButtonPrimaryStyleValue()) == null) {
            return;
        }
        ButtonStylingKt.style$default(personaMaterialButton, buttonPrimaryStyleValue, false, false, 14);
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(Object obj, ViewEnvironment viewEnvironment) {
        viewEnvironment.getClass();
        render((DocumentWorkflow.Screen.ReviewCaptures) obj, zzat.getSystemUiController(viewEnvironment));
    }
}
