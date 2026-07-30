package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.animatable.k;
import com.airbnb.lottie.model.animatable.l;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.j;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class Layer {

    @Nullable
    private final com.airbnb.lottie.model.content.a blurEffect;
    private final com.airbnb.lottie.h composition;

    @Nullable
    private final j dropShadowEffect;
    private final boolean hidden;
    private final List<com.airbnb.lottie.value.a> inOutKeyframes;
    private final long layerId;
    private final String layerName;
    private final LayerType layerType;
    private final List<Mask> masks;
    private final MatteType matteType;
    private final long parentId;
    private final int preCompHeight;
    private final int preCompWidth;

    @Nullable
    private final String refId;
    private final List<com.airbnb.lottie.model.content.c> shapes;
    private final int solidColor;
    private final int solidHeight;
    private final int solidWidth;
    private final float startFrame;

    @Nullable
    private final com.airbnb.lottie.model.animatable.j text;

    @Nullable
    private final k textProperties;

    @Nullable
    private final com.airbnb.lottie.model.animatable.b timeRemapping;
    private final float timeStretch;
    private final l transform;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<com.airbnb.lottie.model.content.c> list, com.airbnb.lottie.h hVar, String str, long j8, LayerType layerType, long j9, @Nullable String str2, List<Mask> list2, l lVar, int i8, int i9, int i10, float f8, float f9, int i11, int i12, @Nullable com.airbnb.lottie.model.animatable.j jVar, @Nullable k kVar, List<com.airbnb.lottie.value.a> list3, MatteType matteType, @Nullable com.airbnb.lottie.model.animatable.b bVar, boolean z7, @Nullable com.airbnb.lottie.model.content.a aVar, @Nullable j jVar2) {
        this.shapes = list;
        this.composition = hVar;
        this.layerName = str;
        this.layerId = j8;
        this.layerType = layerType;
        this.parentId = j9;
        this.refId = str2;
        this.masks = list2;
        this.transform = lVar;
        this.solidWidth = i8;
        this.solidHeight = i9;
        this.solidColor = i10;
        this.timeStretch = f8;
        this.startFrame = f9;
        this.preCompWidth = i11;
        this.preCompHeight = i12;
        this.text = jVar;
        this.textProperties = kVar;
        this.inOutKeyframes = list3;
        this.matteType = matteType;
        this.timeRemapping = bVar;
        this.hidden = z7;
        this.blurEffect = aVar;
        this.dropShadowEffect = jVar2;
    }

    @Nullable
    public com.airbnb.lottie.model.content.a getBlurEffect() {
        return this.blurEffect;
    }

    com.airbnb.lottie.h getComposition() {
        return this.composition;
    }

    @Nullable
    public j getDropShadowEffect() {
        return this.dropShadowEffect;
    }

    public long getId() {
        return this.layerId;
    }

    List<com.airbnb.lottie.value.a> getInOutKeyframes() {
        return this.inOutKeyframes;
    }

    public LayerType getLayerType() {
        return this.layerType;
    }

    List<Mask> getMasks() {
        return this.masks;
    }

    MatteType getMatteType() {
        return this.matteType;
    }

    String getName() {
        return this.layerName;
    }

    long getParentId() {
        return this.parentId;
    }

    int getPreCompHeight() {
        return this.preCompHeight;
    }

    int getPreCompWidth() {
        return this.preCompWidth;
    }

    @Nullable
    String getRefId() {
        return this.refId;
    }

    List<com.airbnb.lottie.model.content.c> getShapes() {
        return this.shapes;
    }

    int getSolidColor() {
        return this.solidColor;
    }

    int getSolidHeight() {
        return this.solidHeight;
    }

    int getSolidWidth() {
        return this.solidWidth;
    }

    float getStartProgress() {
        return this.startFrame / this.composition.getDurationFrames();
    }

    @Nullable
    com.airbnb.lottie.model.animatable.j getText() {
        return this.text;
    }

    @Nullable
    k getTextProperties() {
        return this.textProperties;
    }

    @Nullable
    com.airbnb.lottie.model.animatable.b getTimeRemapping() {
        return this.timeRemapping;
    }

    float getTimeStretch() {
        return this.timeStretch;
    }

    l getTransform() {
        return this.transform;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getName());
        sb.append("\n");
        Layer layerModelForId = this.composition.layerModelForId(getParentId());
        if (layerModelForId != null) {
            sb.append("\t\tParents: ");
            sb.append(layerModelForId.getName());
            Layer layerModelForId2 = this.composition.layerModelForId(layerModelForId.getParentId());
            while (layerModelForId2 != null) {
                sb.append("->");
                sb.append(layerModelForId2.getName());
                layerModelForId2 = this.composition.layerModelForId(layerModelForId2.getParentId());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!getMasks().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(getMasks().size());
            sb.append("\n");
        }
        if (getSolidWidth() != 0 && getSolidHeight() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(getSolidWidth()), Integer.valueOf(getSolidHeight()), Integer.valueOf(getSolidColor())));
        }
        if (!this.shapes.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.c cVar : this.shapes) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(cVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
