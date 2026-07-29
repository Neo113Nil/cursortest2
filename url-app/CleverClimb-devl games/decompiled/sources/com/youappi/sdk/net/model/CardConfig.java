package com.youappi.sdk.net.model;

import com.google.gson.a.c;
import com.google.gson.b.a;
import com.google.gson.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class CardConfig implements Serializable {

    @c(a = "button")
    private ButtonDescriptor _buttonDescriptor;

    @c(a = "eventUrls")
    private EventUrls _eventUrls;

    @c(a = "landscapeImages")
    private ArrayList<String> _landscapeImageUrlList;

    @c(a = "portraitImages")
    private ArrayList<String> _portraitImageUrlList;

    @c(a = "staticAssetUrls")
    private AssetUrls assets;

    @c(a = "injectJs")
    private boolean injectJs = true;

    @c(a = "showNativeControls")
    private boolean showNativeControls = false;

    public class AssetUrls implements Serializable {

        @c(a = "background")
        private String _backgroundResUrl;

        @c(a = "card")
        private String _cardUrl;

        @c(a = "download")
        private String _downloadImgResUrl;

        @c(a = "shadow")
        private String _shadowResUrl;

        @c(a = "stars")
        private String _starsResUrl;

        public AssetUrls() {
        }

        public Map<String, String> asMap() {
            e eVar = new e();
            return (Map) eVar.a(eVar.b(this), new a<Map<String, String>>() { // from class: com.youappi.sdk.net.model.CardConfig.AssetUrls.1
            }.getType());
        }

        public String getBackgroundResUrl() {
            return this._backgroundResUrl;
        }

        public String getCardUrl() {
            return this._cardUrl;
        }

        public String getDownloadImgResUrl() {
            return this._downloadImgResUrl;
        }

        public String getShadowResUrl() {
            return this._shadowResUrl;
        }

        public String getStarsResUrl() {
            return this._starsResUrl;
        }
    }

    public class ButtonDescriptor implements Serializable {
        private String colorEnd;
        private String colorStart;
        private String text;

        public ButtonDescriptor() {
        }

        public String getColorEnd() {
            return this.colorEnd;
        }

        public String getColorStart() {
            return this.colorStart;
        }

        public String getText() {
            return this.text;
        }

        public void setColorEnd(String str) {
            this.colorEnd = str;
        }

        public void setColorStart(String str) {
            this.colorStart = str;
        }

        public void setText(String str) {
            this.text = str;
        }
    }

    public AssetUrls getAssets() {
        return this.assets;
    }

    public ButtonDescriptor getButtonDescriptor() {
        return this._buttonDescriptor;
    }

    public EventUrls getEventUrls() {
        return this._eventUrls;
    }

    public ArrayList<String> getLandscapeImageUrlList() {
        return this._landscapeImageUrlList;
    }

    public ArrayList<String> getPortraitImageUrlList() {
        return this._portraitImageUrlList;
    }

    public boolean isInjectJs() {
        return this.injectJs;
    }

    public boolean isShowNativeControls() {
        return this.showNativeControls;
    }
}
