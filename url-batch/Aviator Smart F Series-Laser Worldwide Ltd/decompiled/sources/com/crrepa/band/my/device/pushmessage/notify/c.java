package com.crrepa.band.my.device.pushmessage.notify;

import android.text.TextUtils;
import com.crrepa.band.my.common.receiver.PhoneStateReceiver;
import com.crrepa.band.my.model.db.MessagePush;
import com.crrepa.band.my.model.db.proxy.BandMessageDaoProxy;

/* loaded from: classes2.dex */
public class c {
    private static final String AMAZON_SHOP_PACKAGE_NAME = "cn.amazon.mShop.android";
    private static final String DAILY_HUNT_PACKAGE_NAME = "com.eterno";
    private static final String DEFAULT_CALENDAR_PACKAGE_NAME = "calendar";
    private static final String DINGTALK_PACKAGE_NAME = "com.alibaba.android.rimet";
    private static final String DISCORD_PACKAGE_NAME = "com.discord";
    private static final String DRIVE_PACKAGE_NAME = "com.google.android.apps.docs";
    private static final String DUNZO_PACKAGE_NAME = "com.dunzo.user";
    private static final String EMAIL = "email";
    private static final String FACABOOK_LITE_PACKAGE_NAME = "com.facebook.lite";
    private static final String FACABOOK_PACKAGE_NAME = "com.facebook.katana";
    private static final String FASTRACK_REFLEX_PACKAGE_NAME = "com.titan.fastrack.reflex";
    private static final String FLIPKART_PACKAGE_NAME = "com.flipkart.android";
    private static final String GAANA_PACKAGE_NAME = "com.gaana";
    private static final String GARB_PACKAGE_NAME = "com.grabtaxi.passenger";
    public static final String GMAIL_PACKAGE_NAME = "com.google.android.gm";
    private static final String GOJEK_PACKAGE_NAME = "com.gojek.app";
    private static final String GOOGLEMAPS_PACKAGE_NAME = "com.google.android.apps.maps";
    private static final String GOOGLE_CALENDAR_PACKAGE_NAME = "com.google.android.calendar";
    private static final String GOOGLE_CHAT_PACKAGE_NAME = "com.google.android.apps.dynamite";
    private static final String GPAY_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";
    private static final String HOTSTAR_PACKAGE_NAME = "in.startv.hotstar";
    private static final String HUAWEI_MEDIA_PACKAGE_NAME = "com.huawei.mediacontroller";
    private static final String INSHORTS_PACKAGE_NAME = "com.nis.app";
    public static final String INSTAGRAM_PACKAGE_NAME = "com.instagram.android";
    private static final String KAKAO_TALK_PACKAGE_NAME = "com.kakao.talk";
    private static final String KUGOU_PACKAGE_NAME = "com.kugou.android";
    private static final String LARK_PACKAGE_NAME = "com.larksuite.suite";
    public static final String LINE_PACKAGE_NAME = "jp.naver.line.android";
    private static final String LINKEDIN_PACKAGE_NAME = "com.linkedin.android";
    private static final String LYFT_PACKAGE_NAME = "me.lyft.android";
    static final int MESSAGE_PUSH_DISABLE = 153;
    public static final String MESSENGER_LITE_PACKAGE_NAME = "com.facebook.mlite";
    public static final String MESSENGER_PACKAGE_NAME = "com.facebook.orca";
    private static final String MORMAII_SMARTWATCHES_PACKAGE_NAME = "br.com.grupotechnos.mormaiismartwatches";
    private static final String NATE_ON_PACKAGE_NAME = "Uxpp.UC";
    private static final String NETFLIX_PACKAGE_NAME = "com.netflix.mediaclient";
    private static final String OLA_PACKAGE_NAME = "com.olacabs.customer";
    private static final String OUTLOOK_PACKAGE_NAME = "com.microsoft.office.outlook";
    private static final String PAYTM_PACKAGE_NAME = "net.one97.paytm";
    private static final String PHONEPE_PACKAGE_NAME = "com.phonepe.app";
    static final int PLAYER_TYPE = 144;
    private static final String PRIME_VIDEO_PACKAGE_NAME = "com.amazon.avod.thirdpartyclient";
    public static final String QQ_PACKAGE_NAME = "com.tencent.mobileqq";
    private static final String REDDIT_PACKAGE_NAME = "com.reddit.frontpage";
    private static final String SHINYV_PLAYER_PACKAGE_NAME = "com.shinyv.cnr";
    private static final String SHOPEE_PACKAGE_NAME = "com.shopee";
    private static final String SING_PLAYER_PACKAGE_NAME = "com.sing.client";
    public static final String SKYPE_PACKAGE_NAME = "com.skype";
    private static final String SLACK_PACKAGE_NAME = "com.Slack";
    private static final String SMARTGOODS_PACKAGE_NAME = "com.smartgoods";
    private static final String SNAPCHAT_PACKAGE_NAME = "com.snapchat.android";
    private static final String SWIGGY_PACKAGE_NAME = "in.swiggy.android";
    private static final String TEAMS_PACKAGE_NAME = "com.microsoft.teams";
    private static final String TELEGRAM_PACKAGE_NAME = "org.telegram.messenger";
    private static final String THREADS_PACKAGE_NAME = "com.instagram.barcelona";
    private static final String TIKTOK_PACKAGE_NAME = "com.ss.android.ugc.trill";
    private static final String TOKOPEDIA_PACKAGE_NAME = "com.tokopedia.tkpd";
    private static final String TWITTER_PACKAGE_NAME = "com.twitter.android";
    private static final String UBER_PACKAGE_NAME = "com.ubercab";
    private static final String VIBER_PACKAGE_NAME = "com.viber.voip";
    private static final String VIVO_PLAYER_PACKAGE_NAME = "com.android.bbkmusic";
    public static final String WECHAT_PACKAGE_NAME = "com.tencent.mm";
    public static final String WHATSAPP_BUSINESS_PACKAGE_NAME = "com.whatsapp.w4b";
    public static final String WHATSAPP_PACKAGE_NAME = "com.whatsapp";
    private static final String WYNK_MUSIC_PACKAGE_NAME = "com.bsbportal.music";
    private static final String YAHOO_EMAIL_PACKAGE_NAME = "com.yahoo.mobile.client.android.mail";
    private static final String YOUTUBE_MUSIC_PACKAGE_NAME = "com.google.android.apps.youtube.music";
    private static final String YOUTUBE_PACKAGE_NAME = "com.google.android.youtube";
    private static final String ZALO_PACKAGE_NAME = "com.zing.zalo";
    private static final String ZOMATO_PACKAGE_NAME = "com.application.zomato";
    private String dialPackageName;
    private boolean isLyrics;
    private String lastPlayerName;
    private MessagePush messagePush;
    private String smsPackageName;

    private static class b {
        private static final c INSTANCE = new c();

        private b() {
        }
    }

    public static c getInstance() {
        return b.INSTANCE;
    }

    public void clearPlayerName() {
        this.lastPlayerName = null;
    }

    public String getDialPackageName() {
        return this.dialPackageName;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public synchronized int getMessageType(String str) {
        char c8;
        if (TextUtils.isEmpty(str)) {
            return MESSAGE_PUSH_DISABLE;
        }
        if (PhoneStateReceiver.isCallRinging()) {
            return MESSAGE_PUSH_DISABLE;
        }
        char c9 = 1;
        if (!TextUtils.isEmpty(this.smsPackageName) && str.contains(this.smsPackageName)) {
            if (!com.crrepa.band.my.device.pushmessage.f.isSmsEnable() || com.crrepa.band.my.device.pushmessage.f.isSmsChanged()) {
                return MESSAGE_PUSH_DISABLE;
            }
            return 1;
        }
        if (this.isLyrics) {
            switch (str.hashCode()) {
                case -1332391354:
                    if (str.equals("com.android.bbkmusic")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -564134010:
                    if (str.equals("com.huawei.mediacontroller")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -277627811:
                    if (str.equals(SHINYV_PLAYER_PACKAGE_NAME)) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 460049591:
                    if (str.equals(KUGOU_PACKAGE_NAME)) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            if (c8 == 0 || c8 == 1 || c8 == 2 || c8 == 3) {
                return 144;
            }
            if (f.isPlayer(str)) {
                this.lastPlayerName = str;
                return MESSAGE_PUSH_DISABLE;
            }
        }
        if (this.messagePush == null) {
            return MESSAGE_PUSH_DISABLE;
        }
        com.crrepa.band.my.ble.band.utils.a aVar = com.crrepa.band.my.ble.band.utils.a.getInstance();
        Boolean othersEnable = this.messagePush.getOthersEnable();
        int i8 = 128;
        if (aVar.isChinese()) {
            if (aVar.hasWechat() && TextUtils.equals(str, WECHAT_PACKAGE_NAME)) {
                othersEnable = this.messagePush.getWechatEnable();
                i8 = 2;
            }
            if (aVar.hasQQ() && TextUtils.equals(str, QQ_PACKAGE_NAME)) {
                othersEnable = this.messagePush.getQqEnable();
                i8 = 3;
            }
        } else if (aVar.hasWechat() && TextUtils.equals(str, WECHAT_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getWechatEnable();
            i8 = 5;
        }
        switch (str.hashCode()) {
            case -1914449536:
                if (str.equals(MESSENGER_LITE_PACKAGE_NAME)) {
                    break;
                }
                c9 = 65535;
                break;
            case -1547699361:
                if (str.equals(WHATSAPP_PACKAGE_NAME)) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case -662003450:
                if (str.equals(INSTAGRAM_PACKAGE_NAME)) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 10619783:
                if (str.equals(TWITTER_PACKAGE_NAME)) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 714499313:
                if (str.equals(FACABOOK_PACKAGE_NAME)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 908042537:
                if (str.equals(FACABOOK_LITE_PACKAGE_NAME)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 908140028:
                if (str.equals(MESSENGER_PACKAGE_NAME)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
            case 1:
                if (aVar.hasMessenger()) {
                    othersEnable = this.messagePush.getMessengerEnable();
                    i8 = 12;
                    break;
                }
            case 2:
            case 3:
                othersEnable = this.messagePush.getFacebookeEnable();
                i8 = 130;
                break;
            case 4:
                othersEnable = this.messagePush.getTwitterEnable();
                i8 = 131;
                break;
            case 5:
                othersEnable = this.messagePush.getWhatsappEnable();
                i8 = 4;
                break;
            case 6:
                othersEnable = this.messagePush.getInstagramEnable();
                i8 = 6;
                break;
            default:
                if (str.startsWith(SKYPE_PACKAGE_NAME)) {
                    othersEnable = this.messagePush.getSkypeEnable();
                    i8 = 7;
                    break;
                }
                break;
        }
        if (aVar.hasLine() && TextUtils.equals(str, LINE_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getLineEnable();
            i8 = 9;
        }
        if (aVar.hasKakao() && TextUtils.equals(str, KAKAO_TALK_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getKakaotalkEnable();
            i8 = 8;
        }
        if (aVar.hasGmail() && TextUtils.equals(str, GMAIL_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getGmailEnable();
            i8 = 17;
        }
        if (aVar.hasTelegram() && TextUtils.equals(str, TELEGRAM_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getTelegramEnable();
            i8 = 14;
        }
        if (aVar.hasNateOn() && TextUtils.equals(str, NATE_ON_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getNateOnEnable();
            i8 = 16;
        }
        if (aVar.hasViber() && TextUtils.equals(str, VIBER_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getViberEnable();
            i8 = 15;
        }
        if (aVar.hasMessage(13) && TextUtils.equals(str, ZALO_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getZaloEnable();
            i8 = 13;
        }
        if (aVar.hasMessage(36) && TextUtils.equals(str, FLIPKART_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getFlipkartEnable();
            i8 = 36;
        }
        if (aVar.hasMessage(18) && TextUtils.equals(str, GOOGLE_CALENDAR_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getCalendarEnable();
            i8 = 18;
        }
        if (aVar.hasMessage(20) && TextUtils.equals(str, OUTLOOK_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getOutlookEnable();
            i8 = 20;
        }
        if (aVar.hasMessage(19) && TextUtils.equals(str, DAILY_HUNT_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getDailhuntEnable();
            i8 = 19;
        }
        if (aVar.hasMessage(23) && TextUtils.equals(str, PHONEPE_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getPhonepeEnable();
            i8 = 23;
        }
        if (aVar.hasMessage(22) && TextUtils.equals(str, INSHORTS_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getInshortsEnable();
            i8 = 22;
        }
        if (aVar.hasMessage(26) && TextUtils.equals(str, SWIGGY_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getSwiggyEnable();
            i8 = 26;
        }
        if (aVar.hasMessage(27) && TextUtils.equals(str, ZOMATO_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getZomatoEnable();
            i8 = 27;
        }
        if (aVar.hasMessage(29) && TextUtils.equals(str, OLA_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getOlaEnable();
            i8 = 29;
        }
        if (aVar.hasMessage(28) && TextUtils.equals(str, UBER_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getUberEnable();
            i8 = 28;
        }
        if (aVar.hasMessage(30) && TextUtils.equals(str, FASTRACK_REFLEX_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getReflexappEnable();
            i8 = 30;
        }
        if (aVar.hasMessage(31) && TextUtils.equals(str, SNAPCHAT_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getSnapchatEnable();
            i8 = 31;
        }
        if (aVar.hasMessage(33) && TextUtils.equals(str, YOUTUBE_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getYoutubeEnable();
            i8 = 33;
        }
        if (aVar.hasMessage(34) && TextUtils.equals(str, LINKEDIN_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getLinkedinEnable();
            i8 = 34;
        }
        if (aVar.hasMessage(25) && TextUtils.equals(str, PAYTM_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getPaytmEnable();
            i8 = 25;
        }
        if (aVar.hasMessage(35) && TextUtils.equals(str, AMAZON_SHOP_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getAmazonEnable();
            i8 = 35;
        }
        if (aVar.hasMessage(37) && TextUtils.equals(str, NETFLIX_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getNetflixEnable();
            i8 = 37;
        }
        if (aVar.hasMessage(24) && TextUtils.equals(str, GPAY_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getGpayEnable();
            i8 = 24;
        }
        if (aVar.hasMessage(21) && TextUtils.equals(str, YAHOO_EMAIL_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getYahooEnable();
            i8 = 21;
        }
        if (aVar.hasMessage(40) && TextUtils.equals(str, GOOGLE_CHAT_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getGoogleChatEnable();
            i8 = 40;
        }
        if (aVar.hasMessage(39) && TextUtils.equals(str, PRIME_VIDEO_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getAmazonPrimeEnable();
            i8 = 39;
        }
        if (aVar.hasMessage(32) && TextUtils.equals(str, YOUTUBE_MUSIC_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getYtmusicEnable();
            i8 = 32;
        }
        if (aVar.hasEmail() && str.contains("email")) {
            othersEnable = this.messagePush.getEmailEnable();
            i8 = 11;
        }
        if (aVar.hasMessage(38) && TextUtils.equals(str, HOTSTAR_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getHotstarEnable();
            i8 = 38;
        }
        if (aVar.hasMessage(41) && TextUtils.equals(str, WYNK_MUSIC_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getWynkEnable();
            i8 = 41;
        }
        if (aVar.hasMessage(42) && TextUtils.equals(str, DRIVE_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getGoogleDriveEnable();
            i8 = 42;
        }
        if (aVar.hasMessage(43) && TextUtils.equals(str, DUNZO_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getDunzoEnable();
            i8 = 43;
        }
        if (aVar.hasMessage(44) && TextUtils.equals(str, GAANA_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getGaanaEnable();
            i8 = 44;
        }
        if (aVar.hasMessage(46) && TextUtils.equals(str, WHATSAPP_BUSINESS_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getWhatsAppBusinessEnable();
            i8 = 46;
        }
        if (aVar.hasMessage(47) && TextUtils.equals(str, DINGTALK_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getDingtalkEnable();
            i8 = 47;
        }
        if (aVar.hasMessage(48) && TextUtils.equals(str, TIKTOK_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getTiktokEnable();
            i8 = 48;
        }
        if (aVar.hasMessage(49) && TextUtils.equals(str, LYFT_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getLyftEnable();
            i8 = 49;
        }
        if (aVar.hasMessage(51) && TextUtils.equals(str, GOOGLEMAPS_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getGoogleMapsEnable();
            i8 = 51;
        }
        if (aVar.hasMessage(52) && TextUtils.equals(str, SLACK_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getSlackEnable();
            i8 = 52;
        }
        if (aVar.hasMessage(53) && TextUtils.equals(str, TEAMS_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getMicrosoftTeamsEnable();
            i8 = 53;
        }
        if (aVar.hasMessage(54) && TextUtils.equals(str, MORMAII_SMARTWATCHES_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getMormaiiSmartwatchesEnable();
            i8 = 54;
        }
        if (aVar.hasMessage(55) && TextUtils.equals(str, REDDIT_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getRedditEnable();
            i8 = 55;
        }
        if (aVar.hasMessage(56) && TextUtils.equals(str, DISCORD_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getDiscordEnable();
            i8 = 56;
        }
        if (aVar.hasMessage(57) && str.contains(DEFAULT_CALENDAR_PACKAGE_NAME) && !TextUtils.equals(str, GOOGLE_CALENDAR_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getDefaultCalendarEnable();
            i8 = 57;
        }
        if (aVar.hasMessage(58) && TextUtils.equals(str, GOJEK_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getGojekEnable();
            i8 = 58;
        }
        if (aVar.hasMessage(59) && TextUtils.equals(str, LARK_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getLarkEnable();
            i8 = 59;
        }
        if (aVar.hasMessage(60) && TextUtils.equals(str, GARB_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getGarbEnable();
            i8 = 60;
        }
        if (aVar.hasMessage(61) && str.startsWith(SHOPEE_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getShopeeEnable();
            i8 = 61;
        }
        if (aVar.hasMessage(62) && TextUtils.equals(str, TOKOPEDIA_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getTokopediaEnable();
            i8 = 62;
        }
        if (aVar.hasMessage(63) && TextUtils.equals(str, THREADS_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getThreadsEnable();
            i8 = 63;
        }
        if (aVar.hasMessage(64) && TextUtils.equals(str, SMARTGOODS_PACKAGE_NAME)) {
            othersEnable = this.messagePush.getSmartgoodsEnable();
            i8 = 64;
        }
        return (othersEnable == null || !othersEnable.booleanValue()) ? MESSAGE_PUSH_DISABLE : i8;
    }

    public boolean is5Sing() {
        return TextUtils.equals(this.lastPlayerName, SING_PLAYER_PACKAGE_NAME);
    }

    public boolean isLyrics() {
        return this.isLyrics;
    }

    public void updateBandFunction(int i8) {
        this.isLyrics = (i8 & 4096) != 0;
    }

    public void updateMessagePush(MessagePush messagePush) {
        this.messagePush = messagePush;
    }

    private c() {
        this.isLyrics = com.crrepa.band.my.ble.band.utils.a.getInstance().isLyric();
        this.messagePush = new BandMessageDaoProxy().get();
        this.smsPackageName = p1.a.getSmsPackageName(com.moyoung.dafit.module.common.utils.d.get());
        this.dialPackageName = p1.a.getDialPackageName(com.moyoung.dafit.module.common.utils.d.get());
    }
}
