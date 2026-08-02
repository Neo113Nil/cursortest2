package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ViewTargetRequestManagerKt;
import coil3.transition.CrossfadeTransition;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.squareup.cash.R;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentReviewAddDocumentTileBinding;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentReviewDocumentTileBinding;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class DocumentTileAdapter extends RecyclerView.Adapter {
    public final RealImageLoader imageLoader;
    public final LayoutInflater inflater;
    public List items;
    public final Function0 onClickAddButton;
    public HCaptcha$$ExternalSyntheticLambda2 removeDocument;
    public final StepStyles.DocumentStepStyle styles;

    public abstract class Item {

        public final class AddButtonItem extends Item {
        }

        public abstract class DocumentItem extends Item {

            public final class Local extends DocumentItem {
                public final DocumentFile.Local document;
                public final File file;
                public final String mimeType;

                public Local(File file, DocumentFile.Local local, String str) {
                    this.file = file;
                    this.document = local;
                    this.mimeType = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Local)) {
                        return false;
                    }
                    Local local = (Local) obj;
                    return this.file.equals(local.file) && this.document.equals(local.document) && Intrinsics.areEqual(this.mimeType, local.mimeType);
                }

                @Override // com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem
                public final DocumentFile getDocument() {
                    return this.document;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.file.hashCode() * 31, 31, this.document.absoluteFilePath);
                    String str = this.mimeType;
                    return m + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Local(file=");
                    sb.append(this.file);
                    sb.append(", document=");
                    sb.append(this.document);
                    sb.append(", mimeType=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.mimeType, ")");
                }
            }

            public final class Remote extends DocumentItem {
                public final DocumentFile.Remote document;
                public final String filename;
                public final String mimeType;
                public final String remoteUrl;

                public Remote(String str, String str2, DocumentFile.Remote remote, String str3) {
                    str.getClass();
                    this.remoteUrl = str;
                    this.filename = str2;
                    this.document = remote;
                    this.mimeType = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Remote)) {
                        return false;
                    }
                    Remote remote = (Remote) obj;
                    return Intrinsics.areEqual(this.remoteUrl, remote.remoteUrl) && Intrinsics.areEqual(this.filename, remote.filename) && this.document.equals(remote.document) && Intrinsics.areEqual(this.mimeType, remote.mimeType);
                }

                @Override // com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem
                public final DocumentFile getDocument() {
                    return this.document;
                }

                public final int hashCode() {
                    int hashCode = this.remoteUrl.hashCode() * 31;
                    String str = this.filename;
                    int hashCode2 = (this.document.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                    String str2 = this.mimeType;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Remote(remoteUrl=", this.remoteUrl, ", filename=", this.filename, ", document=");
                    m.append(this.document);
                    m.append(", mimeType=");
                    m.append(this.mimeType);
                    m.append(")");
                    return m.toString();
                }
            }

            public abstract DocumentFile getDocument();
        }
    }

    public DocumentTileAdapter(Context context, RealImageLoader realImageLoader, Function0 function0, StepStyles.DocumentStepStyle documentStepStyle) {
        context.getClass();
        realImageLoader.getClass();
        function0.getClass();
        this.imageLoader = realImageLoader;
        this.onClickAddButton = function0;
        this.styles = documentStepStyle;
        this.inflater = LayoutInflater.from(context);
        this.items = EmptyList.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Item item = (Item) this.items.get(i);
        if (item instanceof Item.AddButtonItem) {
            return R.layout.pi2_document_review_add_document_tile;
        }
        if (item instanceof Item.DocumentItem) {
            return R.layout.pi2_document_review_document_tile;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        Item item = (Item) this.items.get(i);
        if (item instanceof Item.AddButtonItem) {
            ((Pi2DocumentReviewAddDocumentTileBinding) ((ViewBindingViewHolder) viewHolder).binding).addButton.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 13));
            return;
        }
        if (!(item instanceof Item.DocumentItem)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Pi2DocumentReviewDocumentTileBinding pi2DocumentReviewDocumentTileBinding = (Pi2DocumentReviewDocumentTileBinding) ((ViewBindingViewHolder) viewHolder).binding;
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2DocumentReviewDocumentTileBinding.removeButton;
        TextView textView = pi2DocumentReviewDocumentTileBinding.filenameView;
        CircularProgressIndicator circularProgressIndicator = pi2DocumentReviewDocumentTileBinding.loadingAnimation;
        ImageView imageView = pi2DocumentReviewDocumentTileBinding.imageView;
        Item.DocumentItem documentItem = (Item.DocumentItem) item;
        themeableLottieAnimationView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(3, this, documentItem));
        ViewTargetRequestManagerKt.getRequestManager(imageView).dispose();
        imageView.setImageDrawable(null);
        if (documentItem instanceof Item.DocumentItem.Local) {
            Item.DocumentItem.Local local = (Item.DocumentItem.Local) item;
            int i2 = local.document.uploadProgress;
            imageView.setVisibility(i2 < 100 ? 4 : 0);
            themeableLottieAnimationView.setVisibility(8);
            textView.setText(local.file.getName());
            circularProgressIndicator.setVisibility(i2 < 100 ? 0 : 8);
            circularProgressIndicator.setProgress(i2);
            return;
        }
        if (!(documentItem instanceof Item.DocumentItem.Remote)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        imageView.setVisibility(0);
        Item.DocumentItem.Remote remote = (Item.DocumentItem.Remote) item;
        boolean areEqual = Intrinsics.areEqual(remote.mimeType, "application/pdf");
        RealImageLoader realImageLoader = this.imageLoader;
        if (areEqual) {
            Integer valueOf = Integer.valueOf(R.drawable.pi2_ic_file_pdf);
            ImageRequest.Builder builder = new ImageRequest.Builder(imageView.getContext());
            builder.data = valueOf;
            ImageRequests_androidKt.target(builder, imageView);
            builder.size(100, 100);
            realImageLoader.enqueue(builder.build());
        } else {
            String str = remote.remoteUrl;
            ImageRequest.Builder builder2 = new ImageRequest.Builder(imageView.getContext());
            builder2.data = str;
            ImageRequests_androidKt.target(builder2, imageView);
            Extras.Key key = ImageRequestsKt.transformationsKey;
            CrossfadeTransition.Factory factory = new CrossfadeTransition.Factory(200);
            Extras.Builder extras = builder2.getExtras();
            Extras.Key key2 = ImageRequests_androidKt.transitionFactoryKey;
            extras.set(key2, factory);
            builder2.getExtras().set(key2, new CrossfadeTransition.Factory(100));
            builder2.size(500, 500);
            realImageLoader.enqueue(builder2.build());
        }
        circularProgressIndicator.setVisibility(8);
        themeableLottieAnimationView.setVisibility(0);
        textView.setText(remote.filename);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LottieComposition value;
        LottieComposition value2;
        viewGroup.getClass();
        View inflate = this.inflater.inflate(i, viewGroup, false);
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        int i2 = R.id.card_view;
        if (i == R.layout.pi2_document_review_add_document_tile) {
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.add_button);
            if (themeableLottieAnimationView != null) {
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(inflate, R.id.card_view);
                if (materialCardView != null) {
                    ViewBindingViewHolder viewBindingViewHolder = new ViewBindingViewHolder(new Pi2DocumentReviewAddDocumentTileBinding((ConstraintLayout) inflate, themeableLottieAnimationView, materialCardView));
                    ViewBinding viewBinding = viewBindingViewHolder.binding;
                    Pi2DocumentReviewAddDocumentTileBinding pi2DocumentReviewAddDocumentTileBinding = (Pi2DocumentReviewAddDocumentTileBinding) viewBinding;
                    LottieResult<LottieComposition> fromRawResSync = LottieCompositionFactory.fromRawResSync(pi2DocumentReviewAddDocumentTileBinding.rootView.getContext(), R.raw.pi2_add_document_button);
                    if (fromRawResSync != null && (value2 = fromRawResSync.getValue()) != null) {
                        pi2DocumentReviewAddDocumentTileBinding.addButton.setComposition(value2);
                    }
                    viewBinding.getClass();
                    Pi2DocumentReviewAddDocumentTileBinding pi2DocumentReviewAddDocumentTileBinding2 = (Pi2DocumentReviewAddDocumentTileBinding) viewBinding;
                    ThemeableLottieAnimationView themeableLottieAnimationView2 = pi2DocumentReviewAddDocumentTileBinding2.addButton;
                    MaterialCardView materialCardView2 = pi2DocumentReviewAddDocumentTileBinding2.cardView;
                    if (documentStepStyle == null) {
                        return viewBindingViewHolder;
                    }
                    Double imagePreviewBorderRadius = documentStepStyle.getImagePreviewBorderRadius();
                    if (imagePreviewBorderRadius != null) {
                        materialCardView2.setRadius((float) ExtensionsKt.getDpToPx(imagePreviewBorderRadius.doubleValue()));
                    }
                    Double imagePreviewBorderWidth = documentStepStyle.getImagePreviewBorderWidth();
                    if (imagePreviewBorderWidth != null) {
                        materialCardView2.setStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(imagePreviewBorderWidth.doubleValue())));
                    }
                    Integer imagePreviewBorderColor = documentStepStyle.getImagePreviewBorderColor();
                    if (imagePreviewBorderColor != null) {
                        materialCardView2.setStrokeColor(imagePreviewBorderColor.intValue());
                    }
                    Integer imagePreviewMainAreaFillColor = documentStepStyle.getImagePreviewMainAreaFillColor();
                    if (imagePreviewMainAreaFillColor != null) {
                        themeableLottieAnimationView2.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
                    }
                    ImageStylingKt.replaceColors(themeableLottieAnimationView2, documentStepStyle.getImagePreviewPlusIconStrokeColor(), documentStepStyle.getImagePreviewPlusIconFillColor(), null, null, new String[]{"#FFFFFF"}, new String[]{"#5B3FD3"}, new String[0], new String[0]);
                    return viewBindingViewHolder;
                }
            } else {
                i2 = R.id.add_button;
            }
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        if (i != R.layout.pi2_document_review_document_tile) {
            Path$$ExternalSyntheticBUOutline0.m$1(i, "Unknown view type ");
            return null;
        }
        MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(inflate, R.id.card_view);
        if (materialCardView3 != null) {
            i2 = R.id.filename_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.filename_view);
            if (textView != null) {
                i2 = R.id.image_view;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.image_view);
                if (imageView != null) {
                    i2 = R.id.image_view_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.image_view_container);
                    if (linearLayout != null) {
                        i2 = R.id.loading_animation;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(inflate, R.id.loading_animation);
                        if (circularProgressIndicator != null) {
                            i2 = R.id.remove_button;
                            ThemeableLottieAnimationView themeableLottieAnimationView3 = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.remove_button);
                            if (themeableLottieAnimationView3 != null) {
                                ViewBindingViewHolder viewBindingViewHolder2 = new ViewBindingViewHolder(new Pi2DocumentReviewDocumentTileBinding((ConstraintLayout) inflate, materialCardView3, textView, imageView, linearLayout, circularProgressIndicator, themeableLottieAnimationView3));
                                ViewBinding viewBinding2 = viewBindingViewHolder2.binding;
                                Pi2DocumentReviewDocumentTileBinding pi2DocumentReviewDocumentTileBinding = (Pi2DocumentReviewDocumentTileBinding) viewBinding2;
                                LottieResult<LottieComposition> fromRawResSync2 = LottieCompositionFactory.fromRawResSync(pi2DocumentReviewDocumentTileBinding.rootView.getContext(), R.raw.pi2_remove_document_button);
                                if (fromRawResSync2 != null && (value = fromRawResSync2.getValue()) != null) {
                                    pi2DocumentReviewDocumentTileBinding.removeButton.setComposition(value);
                                }
                                viewBinding2.getClass();
                                Pi2DocumentReviewDocumentTileBinding pi2DocumentReviewDocumentTileBinding2 = (Pi2DocumentReviewDocumentTileBinding) viewBinding2;
                                CircularProgressIndicator circularProgressIndicator2 = pi2DocumentReviewDocumentTileBinding2.loadingAnimation;
                                MaterialCardView materialCardView4 = pi2DocumentReviewDocumentTileBinding2.cardView;
                                if (documentStepStyle == null) {
                                    return viewBindingViewHolder2;
                                }
                                Integer strokeColorValue = documentStepStyle.getStrokeColorValue();
                                if (strokeColorValue != null) {
                                    circularProgressIndicator2.setIndicatorColor(strokeColorValue.intValue());
                                }
                                Integer fillColorValue = documentStepStyle.getFillColorValue();
                                if (fillColorValue != null) {
                                    circularProgressIndicator2.setTrackColor(fillColorValue.intValue());
                                }
                                Integer imagePreviewCropAreaFillColor = documentStepStyle.getImagePreviewCropAreaFillColor();
                                if (imagePreviewCropAreaFillColor != null) {
                                    pi2DocumentReviewDocumentTileBinding2.imageView.setBackgroundColor(imagePreviewCropAreaFillColor.intValue());
                                }
                                Double imagePreviewBorderRadius2 = documentStepStyle.getImagePreviewBorderRadius();
                                if (imagePreviewBorderRadius2 != null) {
                                    materialCardView4.setRadius((float) ExtensionsKt.getDpToPx(imagePreviewBorderRadius2.doubleValue()));
                                }
                                Double imagePreviewBorderWidth2 = documentStepStyle.getImagePreviewBorderWidth();
                                if (imagePreviewBorderWidth2 != null) {
                                    materialCardView4.setStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(imagePreviewBorderWidth2.doubleValue())));
                                }
                                Integer imagePreviewBorderColor2 = documentStepStyle.getImagePreviewBorderColor();
                                if (imagePreviewBorderColor2 != null) {
                                    materialCardView4.setStrokeColor(imagePreviewBorderColor2.intValue());
                                }
                                TextBasedComponentStyle imageNameStyleValue = documentStepStyle.getImageNameStyleValue();
                                if (imageNameStyleValue != null) {
                                    TextStylingKt.style(pi2DocumentReviewDocumentTileBinding2.filenameView, imageNameStyleValue, EmptySet.INSTANCE);
                                }
                                Integer imagePreviewMainAreaFillColor2 = documentStepStyle.getImagePreviewMainAreaFillColor();
                                if (imagePreviewMainAreaFillColor2 != null) {
                                    pi2DocumentReviewDocumentTileBinding2.imageViewContainer.setBackgroundColor(imagePreviewMainAreaFillColor2.intValue());
                                }
                                ImageStylingKt.replaceColors(pi2DocumentReviewDocumentTileBinding2.removeButton, documentStepStyle.getImagePreviewXIconStrokeColor(), documentStepStyle.getImagePreviewXIconFillColor(), null, null, new String[]{"#6B6D82"}, new String[]{"#FFFFFF"}, new String[0], new String[0]);
                                return viewBindingViewHolder2;
                            }
                        }
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
