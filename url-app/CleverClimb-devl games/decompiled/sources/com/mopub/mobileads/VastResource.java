package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
class VastResource implements Serializable {
    private static final long serialVersionUID = 0;
    private CreativeType mCreativeType;
    private int mHeight;
    private String mResource;
    private Type mType;
    private int mWidth;
    private static final List<String> VALID_IMAGE_TYPES = Arrays.asList("image/jpeg", "image/png", "image/bmp", "image/gif");
    private static final List<String> VALID_APPLICATION_TYPES = Arrays.asList("application/x-javascript");

    enum CreativeType {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    enum Type {
        STATIC_RESOURCE,
        HTML_RESOURCE,
        IFRAME_RESOURCE
    }

    static VastResource fromVastResourceXmlManager(VastResourceXmlManager vastResourceXmlManager, int i, int i2) {
        for (Type type : Type.values()) {
            VastResource fromVastResourceXmlManager = fromVastResourceXmlManager(vastResourceXmlManager, type, i, i2);
            if (fromVastResourceXmlManager != null) {
                return fromVastResourceXmlManager;
            }
        }
        return null;
    }

    static VastResource fromVastResourceXmlManager(VastResourceXmlManager vastResourceXmlManager, Type type, int i, int i2) {
        CreativeType creativeType;
        CreativeType creativeType2;
        Preconditions.checkNotNull(vastResourceXmlManager);
        Preconditions.checkNotNull(type);
        String iFrameResource = vastResourceXmlManager.getIFrameResource();
        String hTMLResource = vastResourceXmlManager.getHTMLResource();
        String staticResource = vastResourceXmlManager.getStaticResource();
        String staticResourceType = vastResourceXmlManager.getStaticResourceType();
        if (type == Type.STATIC_RESOURCE && staticResource != null && staticResourceType != null && (VALID_IMAGE_TYPES.contains(staticResourceType) || VALID_APPLICATION_TYPES.contains(staticResourceType))) {
            if (VALID_IMAGE_TYPES.contains(staticResourceType)) {
                creativeType2 = CreativeType.IMAGE;
            } else {
                creativeType2 = CreativeType.JAVASCRIPT;
            }
            creativeType = creativeType2;
        } else if (type == Type.HTML_RESOURCE && hTMLResource != null) {
            creativeType = CreativeType.NONE;
            staticResource = hTMLResource;
        } else {
            if (type != Type.IFRAME_RESOURCE || iFrameResource == null) {
                return null;
            }
            creativeType = CreativeType.NONE;
            staticResource = iFrameResource;
        }
        return new VastResource(staticResource, type, creativeType, i, i2);
    }

    VastResource(String str, Type type, CreativeType creativeType, int i, int i2) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(type);
        Preconditions.checkNotNull(creativeType);
        this.mResource = str;
        this.mType = type;
        this.mCreativeType = creativeType;
        this.mWidth = i;
        this.mHeight = i2;
    }

    public String getResource() {
        return this.mResource;
    }

    public Type getType() {
        return this.mType;
    }

    public CreativeType getCreativeType() {
        return this.mCreativeType;
    }

    public void initializeWebView(VastWebView vastWebView) {
        Preconditions.checkNotNull(vastWebView);
        if (this.mType == Type.IFRAME_RESOURCE) {
            vastWebView.loadData("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.mWidth + "\" height=\"" + this.mHeight + "\" src=\"" + this.mResource + "\"></iframe>");
            return;
        }
        if (this.mType == Type.HTML_RESOURCE) {
            vastWebView.loadData(this.mResource);
            return;
        }
        if (this.mType == Type.STATIC_RESOURCE) {
            if (this.mCreativeType == CreativeType.IMAGE) {
                vastWebView.loadData("<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.mResource + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
                return;
            }
            if (this.mCreativeType == CreativeType.JAVASCRIPT) {
                vastWebView.loadData("<script src=\"" + this.mResource + "\"></script>");
            }
        }
    }

    public String getCorrectClickThroughUrl(String str, String str2) {
        switch (this.mType) {
            case STATIC_RESOURCE:
                if (CreativeType.IMAGE == this.mCreativeType) {
                    return str;
                }
                if (CreativeType.JAVASCRIPT == this.mCreativeType) {
                    return str2;
                }
                return null;
            case HTML_RESOURCE:
            case IFRAME_RESOURCE:
                return str2;
            default:
                return null;
        }
    }
}
