package com.crrepa.band.my.model;

/* loaded from: classes2.dex */
public class MessageModel {
    public static final int AMAZONPRIME_TYPE = 36;
    public static final int AMAZON_TYPE = 31;
    public static final int CALENDAR_DEFAULT_TYPE = 57;
    public static final int CALENDAR_TYPE = 17;
    public static final int DAILYHUNT_TYPE = 19;
    public static final int DINGTALK_TYPE = 47;
    public static final int DISCORD_TYPE = 56;
    public static final int DRIVE_TYPE = 39;
    public static final int DUNZO_TYPE = 38;
    public static final int EMAIL_TYPE = 42;
    public static final int FACEBOOK_TYPE = 4;
    public static final int FLIPKART_TYPE = 16;
    public static final int GAANA_TYPE = 40;
    public static final int GARB_TYPE = 60;
    public static final int GMAIL_TYPE = 12;
    public static final int GOJEK_TYPE = 58;
    public static final int GOOGLECHAT_TYPE = 35;
    public static final int GOOGLEMAPS_TYPE = 50;
    public static final int GPAY_TYPE = 33;
    public static final int HOTSTAR_TYPE = 43;
    public static final int INSHORTS_TYPE = 21;
    public static final int INSTAGRAM_TYPE = 7;
    public static final int KAKAO_TYPE = 9;
    public static final int LARK_TYPE = 59;
    public static final int LINE_TYPE = 10;
    public static final int LINKEDIN_TYPE = 29;
    public static final int LYFT_TYPE = 49;
    public static final int MESSENGER_TYPE = 11;
    public static final int MICROSOFT_TEAMS_TYPE = 52;
    public static final int MISS_CALL_TYPE = 46;
    public static final int MORMAII_SMARTWATCHES_TYPE = 53;
    public static final int NATE_ON_TYPE = 15;
    public static final int NETFLIX_TYPE = 32;
    public static final int OLA_TYPE = 24;
    public static final int OTHER_TYPE = 128;
    public static final int OUTLOOK_TYPE = 18;
    public static final int PAYTM_TYPE = 30;
    public static final int PHONEPE_TYPE = 20;
    public static final int PHONE_TYPE = 0;
    public static final int QQ_TYPE = 3;
    public static final int REDDIT_TYPE = 55;
    public static final int REFLEX_TYPE = 26;
    public static final int SHOPEE_TYPE = 61;
    public static final int SKYPE_TYPE = 8;
    public static final int SLACK_TYPE = 51;
    public static final int SMARTGOODS_TYPE = 64;
    public static final int SMS_TYPE = 1;
    public static final int SNAPCHAT_TYPE = 27;
    public static final int SWIGGY_TYPE = 22;
    public static final int TELEGRAM_TYPE = 13;
    public static final int THREADS_TYPE = 63;
    public static final int TIKTOK_TYPE = 48;
    public static final int TOKOPEDIA_TYPE = 62;
    public static final int TWITTER_TYPE = 5;
    public static final int UBER_TYPE = 25;
    public static final int VIBER_TYPE = 14;
    public static final int WECHAT_TYPE = 2;
    public static final int WHATSAPP_BUSINESS_TYPE = 45;
    public static final int WHATSAPP_TYPE = 6;
    public static final int WYNK_TYPE = 44;
    public static final int YAHOO_TYPE = 34;
    public static final int YOUTUBE_TYPE = 28;
    public static final int YTMUSIC_TYPE = 37;
    public static final int ZALO_TYPE = 41;
    public static final int ZOMATO_TYPE = 23;
    private boolean enable;
    private int icon;
    private int name;
    private int type;

    public MessageModel(int i8, int i9, int i10, boolean z7) {
        this.type = i8;
        this.icon = i9;
        this.name = i10;
        this.enable = z7;
    }

    public int getIcon() {
        return this.icon;
    }

    public int getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z7) {
        this.enable = z7;
    }

    public void setIcon(int i8) {
        this.icon = i8;
    }

    public void setName(int i8) {
        this.name = i8;
    }

    public void setType(int i8) {
        this.type = i8;
    }
}
