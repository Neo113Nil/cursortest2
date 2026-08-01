package expo.modules.updates.reloadscreen;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ReloadScreenView.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fJ\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0013H\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lexpo/modules/updates/reloadscreen/ReloadScreenView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "progressBar", "Landroid/widget/ProgressBar;", "imageView", "Landroid/widget/ImageView;", "currentConfiguration", "Lexpo/modules/updates/reloadscreen/ReloadScreenConfiguration;", PermissionsResponse.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "updateConfiguration", "", "configuration", "addImageView", "addSpinner", "spinnerConfig", "Lexpo/modules/updates/reloadscreen/SpinnerConfiguration;", "loadImage", "imageSource", "Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;", "loadImageFromUrl", "uri", "Landroid/net/Uri;", "handleImageLoadFailure", "dpToPx", "dp", "", "onDetachedFromWindow", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReloadScreenView extends FrameLayout {
    private ReloadScreenConfiguration currentConfiguration;
    private ImageView imageView;
    private ProgressBar progressBar;
    private final CoroutineScope scope;

    /* compiled from: ReloadScreenView.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageResizeMode.values().length];
            try {
                iArr[ImageResizeMode.CONTAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResizeMode.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageResizeMode.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageResizeMode.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReloadScreenView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReloadScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ReloadScreenView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReloadScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public final void updateConfiguration(ReloadScreenConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.currentConfiguration = configuration;
        removeAllViews();
        if (configuration.getImage() != null && configuration.getImageFullScreen()) {
            setBackgroundColor(0);
        } else {
            setBackgroundColor(configuration.getBackgroundColor());
        }
        if (configuration.getImage() != null) {
            addImageView(configuration);
        }
        if (configuration.getSpinner().getEnabled()) {
            addSpinner(configuration.getSpinner());
        }
    }

    private final void addImageView(ReloadScreenConfiguration configuration) {
        ImageView.ScaleType scaleType;
        ReloadScreenImageSource image = configuration.getImage();
        if (image == null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        int i = WhenMappings.$EnumSwitchMapping$0[configuration.getImageResizeMode().ordinal()];
        if (i == 1) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else if (i == 2) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if (i == 3) {
            scaleType = ImageView.ScaleType.CENTER;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType = ImageView.ScaleType.FIT_XY;
        }
        imageView.setScaleType(scaleType);
        if (configuration.getImageFullScreen()) {
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (image.getWidth() != null && image.getHeight() != null && image.getWidth().doubleValue() > 0.0d && image.getHeight().doubleValue() > 0.0d) {
            Double scale = image.getScale();
            double doubleValue = scale != null ? scale.doubleValue() : 1.0d;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx((float) (image.getWidth().doubleValue() * doubleValue)), dpToPx((float) (image.getHeight().doubleValue() * doubleValue)));
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
        } else {
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        this.imageView = imageView;
        addView(imageView);
        loadImage(image);
    }

    private final void addSpinner(SpinnerConfiguration spinnerConfig) {
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        int dpToPx = dpToPx(spinnerConfig.getSize().getSize());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setTint(spinnerConfig.getColor());
        }
        this.progressBar = progressBar;
        addView(progressBar);
    }

    private final void loadImage(ReloadScreenImageSource imageSource) {
        Uri url;
        ImageView imageView = this.imageView;
        if (imageView == null || (url = imageSource.getUrl()) == null) {
            return;
        }
        loadImageFromUrl(url, imageView);
    }

    private final void loadImageFromUrl(Uri uri, ImageView imageView) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new ReloadScreenView$loadImageFromUrl$1(uri, this, imageView, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleImageLoadFailure() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ReloadScreenConfiguration reloadScreenConfiguration = this.currentConfiguration;
        if (reloadScreenConfiguration != null) {
            setBackgroundColor(reloadScreenConfiguration.getBackgroundColor());
            addSpinner(SpinnerConfiguration.copy$default(reloadScreenConfiguration.getSpinner(), true, 0, null, 6, null));
        }
    }

    private final int dpToPx(float dp) {
        return (int) (dp * getContext().getResources().getDisplayMetrics().density);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
    }
}
