package com.yandex.div.internal.viewpool;

import A2.f;
import B2.d;
import C2.H0;
import C2.M0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.metadata.a;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
@Metadata
/* loaded from: classes2.dex */
public final class ViewPreCreationProfile {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final PreCreationModel custom;

    @NotNull
    private final PreCreationModel gallery;

    @NotNull
    private final PreCreationModel gifImage;

    @NotNull
    private final PreCreationModel grid;

    @Nullable
    private final String id;

    @NotNull
    private final PreCreationModel image;

    @NotNull
    private final PreCreationModel indicator;

    @NotNull
    private final PreCreationModel input;

    @NotNull
    private final PreCreationModel linearContainer;

    @NotNull
    private final PreCreationModel overlapContainer;

    @NotNull
    private final PreCreationModel pager;

    @NotNull
    private final PreCreationModel select;

    @NotNull
    private final PreCreationModel slider;

    @NotNull
    private final PreCreationModel state;

    /* renamed from: switch, reason: not valid java name */
    @NotNull
    private final PreCreationModel f3switch;

    @NotNull
    private final PreCreationModel tab;

    @NotNull
    private final PreCreationModel text;

    @NotNull
    private final PreCreationModel video;

    @NotNull
    private final PreCreationModel wrapContainer;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC3527b serializer() {
            return ViewPreCreationProfile$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ViewPreCreationProfile() {
        this((String) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, 524287, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ViewPreCreationProfile copy$default(ViewPreCreationProfile viewPreCreationProfile, String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, int i4, Object obj) {
        PreCreationModel preCreationModel19;
        PreCreationModel preCreationModel20;
        String str2 = (i4 & 1) != 0 ? viewPreCreationProfile.id : str;
        PreCreationModel preCreationModel21 = (i4 & 2) != 0 ? viewPreCreationProfile.text : preCreationModel;
        PreCreationModel preCreationModel22 = (i4 & 4) != 0 ? viewPreCreationProfile.image : preCreationModel2;
        PreCreationModel preCreationModel23 = (i4 & 8) != 0 ? viewPreCreationProfile.gifImage : preCreationModel3;
        PreCreationModel preCreationModel24 = (i4 & 16) != 0 ? viewPreCreationProfile.overlapContainer : preCreationModel4;
        PreCreationModel preCreationModel25 = (i4 & 32) != 0 ? viewPreCreationProfile.linearContainer : preCreationModel5;
        PreCreationModel preCreationModel26 = (i4 & 64) != 0 ? viewPreCreationProfile.wrapContainer : preCreationModel6;
        PreCreationModel preCreationModel27 = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? viewPreCreationProfile.grid : preCreationModel7;
        PreCreationModel preCreationModel28 = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? viewPreCreationProfile.gallery : preCreationModel8;
        PreCreationModel preCreationModel29 = (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? viewPreCreationProfile.pager : preCreationModel9;
        PreCreationModel preCreationModel30 = (i4 & 1024) != 0 ? viewPreCreationProfile.tab : preCreationModel10;
        PreCreationModel preCreationModel31 = (i4 & a.f17688n) != 0 ? viewPreCreationProfile.state : preCreationModel11;
        PreCreationModel preCreationModel32 = (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? viewPreCreationProfile.custom : preCreationModel12;
        PreCreationModel preCreationModel33 = (i4 & 8192) != 0 ? viewPreCreationProfile.indicator : preCreationModel13;
        String str3 = str2;
        PreCreationModel preCreationModel34 = (i4 & 16384) != 0 ? viewPreCreationProfile.slider : preCreationModel14;
        PreCreationModel preCreationModel35 = (i4 & 32768) != 0 ? viewPreCreationProfile.input : preCreationModel15;
        PreCreationModel preCreationModel36 = (i4 & 65536) != 0 ? viewPreCreationProfile.select : preCreationModel16;
        PreCreationModel preCreationModel37 = (i4 & 131072) != 0 ? viewPreCreationProfile.video : preCreationModel17;
        if ((i4 & 262144) != 0) {
            preCreationModel20 = preCreationModel37;
            preCreationModel19 = viewPreCreationProfile.f3switch;
        } else {
            preCreationModel19 = preCreationModel18;
            preCreationModel20 = preCreationModel37;
        }
        return viewPreCreationProfile.copy(str3, preCreationModel21, preCreationModel22, preCreationModel23, preCreationModel24, preCreationModel25, preCreationModel26, preCreationModel27, preCreationModel28, preCreationModel29, preCreationModel30, preCreationModel31, preCreationModel32, preCreationModel33, preCreationModel34, preCreationModel35, preCreationModel36, preCreationModel20, preCreationModel19);
    }

    public static final /* synthetic */ void write$Self(ViewPreCreationProfile viewPreCreationProfile, d dVar, f fVar) {
        if (dVar.r(fVar, 0) || viewPreCreationProfile.id != null) {
            dVar.x(fVar, 0, M0.f224a, viewPreCreationProfile.id);
        }
        if (dVar.r(fVar, 1) || !Intrinsics.areEqual(viewPreCreationProfile.text, new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 1, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.text);
        }
        if (dVar.r(fVar, 2) || !Intrinsics.areEqual(viewPreCreationProfile.image, new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 2, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.image);
        }
        if (dVar.r(fVar, 3) || !Intrinsics.areEqual(viewPreCreationProfile.gifImage, new PreCreationModel(3, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 3, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.gifImage);
        }
        if (dVar.r(fVar, 4) || !Intrinsics.areEqual(viewPreCreationProfile.overlapContainer, new PreCreationModel(8, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 4, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.overlapContainer);
        }
        if (dVar.r(fVar, 5) || !Intrinsics.areEqual(viewPreCreationProfile.linearContainer, new PreCreationModel(12, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 5, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.linearContainer);
        }
        if (dVar.r(fVar, 6) || !Intrinsics.areEqual(viewPreCreationProfile.wrapContainer, new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 6, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.wrapContainer);
        }
        if (dVar.r(fVar, 7) || !Intrinsics.areEqual(viewPreCreationProfile.grid, new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 7, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.grid);
        }
        if (dVar.r(fVar, 8) || !Intrinsics.areEqual(viewPreCreationProfile.gallery, new PreCreationModel(6, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 8, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.gallery);
        }
        if (dVar.r(fVar, 9) || !Intrinsics.areEqual(viewPreCreationProfile.pager, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 9, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.pager);
        }
        if (dVar.r(fVar, 10) || !Intrinsics.areEqual(viewPreCreationProfile.tab, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 10, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.tab);
        }
        if (dVar.r(fVar, 11) || !Intrinsics.areEqual(viewPreCreationProfile.state, new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 11, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.state);
        }
        if (dVar.r(fVar, 12) || !Intrinsics.areEqual(viewPreCreationProfile.custom, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 12, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.custom);
        }
        if (dVar.r(fVar, 13) || !Intrinsics.areEqual(viewPreCreationProfile.indicator, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 13, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.indicator);
        }
        if (dVar.r(fVar, 14) || !Intrinsics.areEqual(viewPreCreationProfile.slider, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 14, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.slider);
        }
        if (dVar.r(fVar, 15) || !Intrinsics.areEqual(viewPreCreationProfile.input, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 15, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.input);
        }
        if (dVar.r(fVar, 16) || !Intrinsics.areEqual(viewPreCreationProfile.select, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 16, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.select);
        }
        if (dVar.r(fVar, 17) || !Intrinsics.areEqual(viewPreCreationProfile.video, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            dVar.m(fVar, 17, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.video);
        }
        if (!dVar.r(fVar, 18) && Intrinsics.areEqual(viewPreCreationProfile.f3switch, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            return;
        }
        dVar.m(fVar, 18, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.f3switch);
    }

    @NotNull
    public final ViewPreCreationProfile copy(@Nullable String str, @NotNull PreCreationModel text, @NotNull PreCreationModel image, @NotNull PreCreationModel gifImage, @NotNull PreCreationModel overlapContainer, @NotNull PreCreationModel linearContainer, @NotNull PreCreationModel wrapContainer, @NotNull PreCreationModel grid, @NotNull PreCreationModel gallery, @NotNull PreCreationModel pager, @NotNull PreCreationModel tab, @NotNull PreCreationModel state, @NotNull PreCreationModel custom, @NotNull PreCreationModel indicator, @NotNull PreCreationModel slider, @NotNull PreCreationModel input, @NotNull PreCreationModel select, @NotNull PreCreationModel video, @NotNull PreCreationModel preCreationModel) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(gifImage, "gifImage");
        Intrinsics.checkNotNullParameter(overlapContainer, "overlapContainer");
        Intrinsics.checkNotNullParameter(linearContainer, "linearContainer");
        Intrinsics.checkNotNullParameter(wrapContainer, "wrapContainer");
        Intrinsics.checkNotNullParameter(grid, "grid");
        Intrinsics.checkNotNullParameter(gallery, "gallery");
        Intrinsics.checkNotNullParameter(pager, "pager");
        Intrinsics.checkNotNullParameter(tab, "tab");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(custom, "custom");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(slider, "slider");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(select, "select");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(preCreationModel, "switch");
        return new ViewPreCreationProfile(str, text, image, gifImage, overlapContainer, linearContainer, wrapContainer, grid, gallery, pager, tab, state, custom, indicator, slider, input, select, video, preCreationModel);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewPreCreationProfile)) {
            return false;
        }
        ViewPreCreationProfile viewPreCreationProfile = (ViewPreCreationProfile) obj;
        return Intrinsics.areEqual(this.id, viewPreCreationProfile.id) && Intrinsics.areEqual(this.text, viewPreCreationProfile.text) && Intrinsics.areEqual(this.image, viewPreCreationProfile.image) && Intrinsics.areEqual(this.gifImage, viewPreCreationProfile.gifImage) && Intrinsics.areEqual(this.overlapContainer, viewPreCreationProfile.overlapContainer) && Intrinsics.areEqual(this.linearContainer, viewPreCreationProfile.linearContainer) && Intrinsics.areEqual(this.wrapContainer, viewPreCreationProfile.wrapContainer) && Intrinsics.areEqual(this.grid, viewPreCreationProfile.grid) && Intrinsics.areEqual(this.gallery, viewPreCreationProfile.gallery) && Intrinsics.areEqual(this.pager, viewPreCreationProfile.pager) && Intrinsics.areEqual(this.tab, viewPreCreationProfile.tab) && Intrinsics.areEqual(this.state, viewPreCreationProfile.state) && Intrinsics.areEqual(this.custom, viewPreCreationProfile.custom) && Intrinsics.areEqual(this.indicator, viewPreCreationProfile.indicator) && Intrinsics.areEqual(this.slider, viewPreCreationProfile.slider) && Intrinsics.areEqual(this.input, viewPreCreationProfile.input) && Intrinsics.areEqual(this.select, viewPreCreationProfile.select) && Intrinsics.areEqual(this.video, viewPreCreationProfile.video) && Intrinsics.areEqual(this.f3switch, viewPreCreationProfile.f3switch);
    }

    @NotNull
    public final PreCreationModel getCustom() {
        return this.custom;
    }

    @NotNull
    public final PreCreationModel getGallery() {
        return this.gallery;
    }

    @NotNull
    public final PreCreationModel getGifImage() {
        return this.gifImage;
    }

    @NotNull
    public final PreCreationModel getGrid() {
        return this.grid;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final PreCreationModel getImage() {
        return this.image;
    }

    @NotNull
    public final PreCreationModel getIndicator() {
        return this.indicator;
    }

    @NotNull
    public final PreCreationModel getInput() {
        return this.input;
    }

    @NotNull
    public final PreCreationModel getLinearContainer() {
        return this.linearContainer;
    }

    @NotNull
    public final PreCreationModel getOverlapContainer() {
        return this.overlapContainer;
    }

    @NotNull
    public final PreCreationModel getPager() {
        return this.pager;
    }

    @NotNull
    public final PreCreationModel getSelect() {
        return this.select;
    }

    @NotNull
    public final PreCreationModel getSlider() {
        return this.slider;
    }

    @NotNull
    public final PreCreationModel getState() {
        return this.state;
    }

    @NotNull
    public final PreCreationModel getSwitch() {
        return this.f3switch;
    }

    @NotNull
    public final PreCreationModel getTab() {
        return this.tab;
    }

    @NotNull
    public final PreCreationModel getText() {
        return this.text;
    }

    @NotNull
    public final PreCreationModel getVideo() {
        return this.video;
    }

    @NotNull
    public final PreCreationModel getWrapContainer() {
        return this.wrapContainer;
    }

    public int hashCode() {
        String str = this.id;
        return ((((((((((((((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.text.hashCode()) * 31) + this.image.hashCode()) * 31) + this.gifImage.hashCode()) * 31) + this.overlapContainer.hashCode()) * 31) + this.linearContainer.hashCode()) * 31) + this.wrapContainer.hashCode()) * 31) + this.grid.hashCode()) * 31) + this.gallery.hashCode()) * 31) + this.pager.hashCode()) * 31) + this.tab.hashCode()) * 31) + this.state.hashCode()) * 31) + this.custom.hashCode()) * 31) + this.indicator.hashCode()) * 31) + this.slider.hashCode()) * 31) + this.input.hashCode()) * 31) + this.select.hashCode()) * 31) + this.video.hashCode()) * 31) + this.f3switch.hashCode();
    }

    @NotNull
    public String toString() {
        return "ViewPreCreationProfile(id=" + this.id + ", text=" + this.text + ", image=" + this.image + ", gifImage=" + this.gifImage + ", overlapContainer=" + this.overlapContainer + ", linearContainer=" + this.linearContainer + ", wrapContainer=" + this.wrapContainer + ", grid=" + this.grid + ", gallery=" + this.gallery + ", pager=" + this.pager + ", tab=" + this.tab + ", state=" + this.state + ", custom=" + this.custom + ", indicator=" + this.indicator + ", slider=" + this.slider + ", input=" + this.input + ", select=" + this.select + ", video=" + this.video + ", switch=" + this.f3switch + ')';
    }

    public /* synthetic */ ViewPreCreationProfile(int i4, String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, H0 h02) {
        this.id = (i4 & 1) == 0 ? null : str;
        if ((i4 & 2) == 0) {
            this.text = new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.text = preCreationModel;
        }
        if ((i4 & 4) == 0) {
            this.image = new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.image = preCreationModel2;
        }
        if ((i4 & 8) == 0) {
            this.gifImage = new PreCreationModel(3, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.gifImage = preCreationModel3;
        }
        if ((i4 & 16) == 0) {
            this.overlapContainer = new PreCreationModel(8, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.overlapContainer = preCreationModel4;
        }
        if ((i4 & 32) == 0) {
            this.linearContainer = new PreCreationModel(12, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.linearContainer = preCreationModel5;
        }
        if ((i4 & 64) == 0) {
            this.wrapContainer = new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.wrapContainer = preCreationModel6;
        }
        if ((i4 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
            this.grid = new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.grid = preCreationModel7;
        }
        if ((i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
            this.gallery = new PreCreationModel(6, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.gallery = preCreationModel8;
        }
        if ((i4 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
            this.pager = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.pager = preCreationModel9;
        }
        if ((i4 & 1024) == 0) {
            this.tab = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.tab = preCreationModel10;
        }
        if ((i4 & a.f17688n) == 0) {
            this.state = new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.state = preCreationModel11;
        }
        if ((i4 & Base64Utils.IO_BUFFER_SIZE) == 0) {
            this.custom = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.custom = preCreationModel12;
        }
        if ((i4 & 8192) == 0) {
            this.indicator = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.indicator = preCreationModel13;
        }
        if ((i4 & 16384) == 0) {
            this.slider = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.slider = preCreationModel14;
        }
        if ((32768 & i4) == 0) {
            this.input = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.input = preCreationModel15;
        }
        if ((65536 & i4) == 0) {
            this.select = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.select = preCreationModel16;
        }
        if ((131072 & i4) == 0) {
            this.video = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.video = preCreationModel17;
        }
        if ((i4 & 262144) == 0) {
            this.f3switch = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.f3switch = preCreationModel18;
        }
    }

    public ViewPreCreationProfile(@Nullable String str, @NotNull PreCreationModel text, @NotNull PreCreationModel image, @NotNull PreCreationModel gifImage, @NotNull PreCreationModel overlapContainer, @NotNull PreCreationModel linearContainer, @NotNull PreCreationModel wrapContainer, @NotNull PreCreationModel grid, @NotNull PreCreationModel gallery, @NotNull PreCreationModel pager, @NotNull PreCreationModel tab, @NotNull PreCreationModel state, @NotNull PreCreationModel custom, @NotNull PreCreationModel indicator, @NotNull PreCreationModel slider, @NotNull PreCreationModel input, @NotNull PreCreationModel select, @NotNull PreCreationModel video, @NotNull PreCreationModel preCreationModel) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(gifImage, "gifImage");
        Intrinsics.checkNotNullParameter(overlapContainer, "overlapContainer");
        Intrinsics.checkNotNullParameter(linearContainer, "linearContainer");
        Intrinsics.checkNotNullParameter(wrapContainer, "wrapContainer");
        Intrinsics.checkNotNullParameter(grid, "grid");
        Intrinsics.checkNotNullParameter(gallery, "gallery");
        Intrinsics.checkNotNullParameter(pager, "pager");
        Intrinsics.checkNotNullParameter(tab, "tab");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(custom, "custom");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(slider, "slider");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(select, "select");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(preCreationModel, "switch");
        this.id = str;
        this.text = text;
        this.image = image;
        this.gifImage = gifImage;
        this.overlapContainer = overlapContainer;
        this.linearContainer = linearContainer;
        this.wrapContainer = wrapContainer;
        this.grid = grid;
        this.gallery = gallery;
        this.pager = pager;
        this.tab = tab;
        this.state = state;
        this.custom = custom;
        this.indicator = indicator;
        this.slider = slider;
        this.input = input;
        this.select = select;
        this.video = video;
        this.f3switch = preCreationModel;
    }

    public /* synthetic */ ViewPreCreationProfile(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel, (i4 & 4) != 0 ? new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel2, (i4 & 8) != 0 ? new PreCreationModel(3, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel3, (i4 & 16) != 0 ? new PreCreationModel(8, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel4, (i4 & 32) != 0 ? new PreCreationModel(12, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel5, (i4 & 64) != 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel6, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel7, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new PreCreationModel(6, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel8, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel9, (i4 & 1024) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel10, (i4 & a.f17688n) != 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel11, (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel12, (i4 & 8192) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel13, (i4 & 16384) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel14, (i4 & 32768) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel15, (i4 & 65536) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel16, (i4 & 131072) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel17, (i4 & 262144) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel18);
    }
}
