package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.MessagePush;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class MessagePushDao extends a {
    public static final String TABLENAME = "MESSAGE_PUSH";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f PhoneEnable = new f(1, Boolean.class, "phoneEnable", false, "PHONE_ENABLE");
        public static final f MessageEnable = new f(2, Boolean.class, "messageEnable", false, "MESSAGE_ENABLE");
        public static final f QqEnable = new f(3, Boolean.class, "qqEnable", false, "QQ_ENABLE");
        public static final f WechatEnable = new f(4, Boolean.class, "wechatEnable", false, "WECHAT_ENABLE");
        public static final f FacebookeEnable = new f(5, Boolean.class, "facebookeEnable", false, "FACEBOOKE_ENABLE");
        public static final f MessengerEnable = new f(6, Boolean.class, "messengerEnable", false, "MESSENGER_ENABLE");
        public static final f TwitterEnable = new f(7, Boolean.class, "twitterEnable", false, "TWITTER_ENABLE");
        public static final f KakaotalkEnable = new f(8, Boolean.class, "kakaotalkEnable", false, "KAKAOTALK_ENABLE");
        public static final f LineEnable = new f(9, Boolean.class, "lineEnable", false, "LINE_ENABLE");
        public static final f WhatsappEnable = new f(10, Boolean.class, "whatsappEnable", false, "WHATSAPP_ENABLE");
        public static final f InstagramEnable = new f(11, Boolean.class, "instagramEnable", false, "INSTAGRAM_ENABLE");
        public static final f SkypeEnable = new f(12, Boolean.class, "skypeEnable", false, "SKYPE_ENABLE");
        public static final f OthersEnable = new f(13, Boolean.class, "othersEnable", false, "OTHERS_ENABLE");
        public static final f GmailEnable = new f(14, Boolean.class, "gmailEnable", false, "GMAIL_ENABLE");
        public static final f TelegramEnable = new f(15, Boolean.class, "telegramEnable", false, "TELEGRAM_ENABLE");
        public static final f ViberEnable = new f(16, Boolean.class, "viberEnable", false, "VIBER_ENABLE");
        public static final f NateOnEnable = new f(17, Boolean.class, "nateOnEnable", false, "NATE_ON_ENABLE");
        public static final f FlipkartEnable = new f(18, Boolean.class, "flipkartEnable", false, "FLIPKART_ENABLE");
        public static final f CalendarEnable = new f(19, Boolean.class, "calendarEnable", false, "CALENDAR_ENABLE");
        public static final f OutlookEnable = new f(20, Boolean.class, "outlookEnable", false, "OUTLOOK_ENABLE");
        public static final f DailhuntEnable = new f(21, Boolean.class, "dailhuntEnable", false, "DAILHUNT_ENABLE");
        public static final f PhonepeEnable = new f(22, Boolean.class, "phonepeEnable", false, "PHONEPE_ENABLE");
        public static final f InshortsEnable = new f(23, Boolean.class, "inshortsEnable", false, "INSHORTS_ENABLE");
        public static final f SwiggyEnable = new f(24, Boolean.class, "swiggyEnable", false, "SWIGGY_ENABLE");
        public static final f ZomatoEnable = new f(25, Boolean.class, "zomatoEnable", false, "ZOMATO_ENABLE");
        public static final f OlaEnable = new f(26, Boolean.class, "olaEnable", false, "OLA_ENABLE");
        public static final f ReflexappEnable = new f(27, Boolean.class, "reflexappEnable", false, "REFLEXAPP_ENABLE");
        public static final f SnapchatEnable = new f(28, Boolean.class, "snapchatEnable", false, "SNAPCHAT_ENABLE");
        public static final f UberEnable = new f(29, Boolean.class, "uberEnable", false, "UBER_ENABLE");
        public static final f YoutubeEnable = new f(30, Boolean.class, "youtubeEnable", false, "YOUTUBE_ENABLE");
        public static final f LinkedinEnable = new f(31, Boolean.class, "linkedinEnable", false, "LINKEDIN_ENABLE");
        public static final f PaytmEnable = new f(32, Boolean.class, "paytmEnable", false, "PAYTM_ENABLE");
        public static final f AmazonEnable = new f(33, Boolean.class, "amazonEnable", false, "AMAZON_ENABLE");
        public static final f NetflixEnable = new f(34, Boolean.class, "netflixEnable", false, "NETFLIX_ENABLE");
        public static final f GpayEnable = new f(35, Boolean.class, "gpayEnable", false, "GPAY_ENABLE");
        public static final f YahooEnable = new f(36, Boolean.class, "yahooEnable", false, "YAHOO_ENABLE");
        public static final f GoogleChatEnable = new f(37, Boolean.class, "googleChatEnable", false, "GOOGLE_CHAT_ENABLE");
        public static final f AmazonPrimeEnable = new f(38, Boolean.class, "amazonPrimeEnable", false, "AMAZON_PRIME_ENABLE");
        public static final f YtmusicEnable = new f(39, Boolean.class, "ytmusicEnable", false, "YTMUSIC_ENABLE");
        public static final f DunzoEnable = new f(40, Boolean.class, "dunzoEnable", false, "DUNZO_ENABLE");
        public static final f DriveEnable = new f(41, Boolean.class, "driveEnable", false, "DRIVE_ENABLE");
        public static final f GaanaEnable = new f(42, Boolean.class, "gaanaEnable", false, "GAANA_ENABLE");
        public static final f ZaloEnable = new f(43, Boolean.class, "zaloEnable", false, "ZALO_ENABLE");
        public static final f EmailEnable = new f(44, Boolean.class, "emailEnable", false, "EMAIL_ENABLE");
        public static final f HotstarEnable = new f(45, Boolean.class, "hotstarEnable", false, "HOTSTAR_ENABLE");
        public static final f WynkEnable = new f(46, Boolean.class, "wynkEnable", false, "WYNK_ENABLE");
        public static final f GoogleDriveEnable = new f(47, Boolean.class, "googleDriveEnable", false, "GOOGLE_DRIVE_ENABLE");
        public static final f MissCallEnable = new f(48, Boolean.class, "missCallEnable", false, "MISS_CALL_ENABLE");
        public static final f WhatsAppBusinessEnable = new f(49, Boolean.class, "whatsAppBusinessEnable", false, "WHATS_APP_BUSINESS_ENABLE");
        public static final f DingtalkEnable = new f(50, Boolean.class, "dingtalkEnable", false, "DINGTALK_ENABLE");
        public static final f TiktokEnable = new f(51, Boolean.class, "tiktokEnable", false, "TIKTOK_ENABLE");
        public static final f LyftEnable = new f(52, Boolean.class, "lyftEnable", false, "LYFT_ENABLE");
        public static final f GoogleMapsEnable = new f(53, Boolean.class, "googleMapsEnable", false, "GOOGLE_MAPS_ENABLE");
        public static final f SlackEnable = new f(54, Boolean.class, "slackEnable", false, "SLACK_ENABLE");
        public static final f MicrosoftTeamsEnable = new f(55, Boolean.class, "microsoftTeamsEnable", false, "MICROSOFT_TEAMS_ENABLE");
        public static final f MormaiiSmartwatchesEnable = new f(56, Boolean.class, "mormaiiSmartwatchesEnable", false, "MORMAII_SMARTWATCHES_ENABLE");
        public static final f RedditEnable = new f(57, Boolean.class, "redditEnable", false, "REDDIT_ENABLE");
        public static final f DiscordEnable = new f(58, Boolean.class, "discordEnable", false, "DISCORD_ENABLE");
        public static final f DefaultCalendarEnable = new f(59, Boolean.class, "defaultCalendarEnable", false, "DEFAULT_CALENDAR_ENABLE");
        public static final f GojekEnable = new f(60, Boolean.class, "gojekEnable", false, "GOJEK_ENABLE");
        public static final f LarkEnable = new f(61, Boolean.class, "larkEnable", false, "LARK_ENABLE");
        public static final f GarbEnable = new f(62, Boolean.class, "garbEnable", false, "GARB_ENABLE");
        public static final f ShopeeEnable = new f(63, Boolean.class, "shopeeEnable", false, "SHOPEE_ENABLE");
        public static final f TokopediaEnable = new f(64, Boolean.class, "tokopediaEnable", false, "TOKOPEDIA_ENABLE");
        public static final f ThreadsEnable = new f(65, Boolean.class, "threadsEnable", false, "THREADS_ENABLE");
        public static final f SmartgoodsEnable = new f(66, Boolean.class, "smartgoodsEnable", false, "SMARTGOODS_ENABLE");
    }

    public MessagePushDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"MESSAGE_PUSH\" (\"_id\" INTEGER PRIMARY KEY ,\"PHONE_ENABLE\" INTEGER,\"MESSAGE_ENABLE\" INTEGER,\"QQ_ENABLE\" INTEGER,\"WECHAT_ENABLE\" INTEGER,\"FACEBOOKE_ENABLE\" INTEGER,\"MESSENGER_ENABLE\" INTEGER,\"TWITTER_ENABLE\" INTEGER,\"KAKAOTALK_ENABLE\" INTEGER,\"LINE_ENABLE\" INTEGER,\"WHATSAPP_ENABLE\" INTEGER,\"INSTAGRAM_ENABLE\" INTEGER,\"SKYPE_ENABLE\" INTEGER,\"OTHERS_ENABLE\" INTEGER,\"GMAIL_ENABLE\" INTEGER,\"TELEGRAM_ENABLE\" INTEGER,\"VIBER_ENABLE\" INTEGER,\"NATE_ON_ENABLE\" INTEGER,\"FLIPKART_ENABLE\" INTEGER,\"CALENDAR_ENABLE\" INTEGER,\"OUTLOOK_ENABLE\" INTEGER,\"DAILHUNT_ENABLE\" INTEGER,\"PHONEPE_ENABLE\" INTEGER,\"INSHORTS_ENABLE\" INTEGER,\"SWIGGY_ENABLE\" INTEGER,\"ZOMATO_ENABLE\" INTEGER,\"OLA_ENABLE\" INTEGER,\"REFLEXAPP_ENABLE\" INTEGER,\"SNAPCHAT_ENABLE\" INTEGER,\"UBER_ENABLE\" INTEGER,\"YOUTUBE_ENABLE\" INTEGER,\"LINKEDIN_ENABLE\" INTEGER,\"PAYTM_ENABLE\" INTEGER,\"AMAZON_ENABLE\" INTEGER,\"NETFLIX_ENABLE\" INTEGER,\"GPAY_ENABLE\" INTEGER,\"YAHOO_ENABLE\" INTEGER,\"GOOGLE_CHAT_ENABLE\" INTEGER,\"AMAZON_PRIME_ENABLE\" INTEGER,\"YTMUSIC_ENABLE\" INTEGER,\"DUNZO_ENABLE\" INTEGER,\"DRIVE_ENABLE\" INTEGER,\"GAANA_ENABLE\" INTEGER,\"ZALO_ENABLE\" INTEGER,\"EMAIL_ENABLE\" INTEGER,\"HOTSTAR_ENABLE\" INTEGER,\"WYNK_ENABLE\" INTEGER,\"GOOGLE_DRIVE_ENABLE\" INTEGER,\"MISS_CALL_ENABLE\" INTEGER,\"WHATS_APP_BUSINESS_ENABLE\" INTEGER,\"DINGTALK_ENABLE\" INTEGER,\"TIKTOK_ENABLE\" INTEGER,\"LYFT_ENABLE\" INTEGER,\"GOOGLE_MAPS_ENABLE\" INTEGER,\"SLACK_ENABLE\" INTEGER,\"MICROSOFT_TEAMS_ENABLE\" INTEGER,\"MORMAII_SMARTWATCHES_ENABLE\" INTEGER,\"REDDIT_ENABLE\" INTEGER,\"DISCORD_ENABLE\" INTEGER,\"DEFAULT_CALENDAR_ENABLE\" INTEGER,\"GOJEK_ENABLE\" INTEGER,\"LARK_ENABLE\" INTEGER,\"GARB_ENABLE\" INTEGER,\"SHOPEE_ENABLE\" INTEGER,\"TOKOPEDIA_ENABLE\" INTEGER,\"THREADS_ENABLE\" INTEGER,\"SMARTGOODS_ENABLE\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"MESSAGE_PUSH\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public MessagePushDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(MessagePush messagePush) {
        if (messagePush != null) {
            return messagePush.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(MessagePush messagePush) {
        return messagePush.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(MessagePush messagePush, long j8) {
        messagePush.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, MessagePush messagePush) {
        cVar.clearBindings();
        Long id = messagePush.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Boolean phoneEnable = messagePush.getPhoneEnable();
        if (phoneEnable != null) {
            cVar.bindLong(2, phoneEnable.booleanValue() ? 1L : 0L);
        }
        Boolean messageEnable = messagePush.getMessageEnable();
        if (messageEnable != null) {
            cVar.bindLong(3, messageEnable.booleanValue() ? 1L : 0L);
        }
        Boolean qqEnable = messagePush.getQqEnable();
        if (qqEnable != null) {
            cVar.bindLong(4, qqEnable.booleanValue() ? 1L : 0L);
        }
        Boolean wechatEnable = messagePush.getWechatEnable();
        if (wechatEnable != null) {
            cVar.bindLong(5, wechatEnable.booleanValue() ? 1L : 0L);
        }
        Boolean facebookeEnable = messagePush.getFacebookeEnable();
        if (facebookeEnable != null) {
            cVar.bindLong(6, facebookeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean messengerEnable = messagePush.getMessengerEnable();
        if (messengerEnable != null) {
            cVar.bindLong(7, messengerEnable.booleanValue() ? 1L : 0L);
        }
        Boolean twitterEnable = messagePush.getTwitterEnable();
        if (twitterEnable != null) {
            cVar.bindLong(8, twitterEnable.booleanValue() ? 1L : 0L);
        }
        Boolean kakaotalkEnable = messagePush.getKakaotalkEnable();
        if (kakaotalkEnable != null) {
            cVar.bindLong(9, kakaotalkEnable.booleanValue() ? 1L : 0L);
        }
        Boolean lineEnable = messagePush.getLineEnable();
        if (lineEnable != null) {
            cVar.bindLong(10, lineEnable.booleanValue() ? 1L : 0L);
        }
        Boolean whatsappEnable = messagePush.getWhatsappEnable();
        if (whatsappEnable != null) {
            cVar.bindLong(11, whatsappEnable.booleanValue() ? 1L : 0L);
        }
        Boolean instagramEnable = messagePush.getInstagramEnable();
        if (instagramEnable != null) {
            cVar.bindLong(12, instagramEnable.booleanValue() ? 1L : 0L);
        }
        Boolean skypeEnable = messagePush.getSkypeEnable();
        if (skypeEnable != null) {
            cVar.bindLong(13, skypeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean othersEnable = messagePush.getOthersEnable();
        if (othersEnable != null) {
            cVar.bindLong(14, othersEnable.booleanValue() ? 1L : 0L);
        }
        Boolean gmailEnable = messagePush.getGmailEnable();
        if (gmailEnable != null) {
            cVar.bindLong(15, gmailEnable.booleanValue() ? 1L : 0L);
        }
        Boolean telegramEnable = messagePush.getTelegramEnable();
        if (telegramEnable != null) {
            cVar.bindLong(16, telegramEnable.booleanValue() ? 1L : 0L);
        }
        Boolean viberEnable = messagePush.getViberEnable();
        if (viberEnable != null) {
            cVar.bindLong(17, viberEnable.booleanValue() ? 1L : 0L);
        }
        Boolean nateOnEnable = messagePush.getNateOnEnable();
        if (nateOnEnable != null) {
            cVar.bindLong(18, nateOnEnable.booleanValue() ? 1L : 0L);
        }
        Boolean flipkartEnable = messagePush.getFlipkartEnable();
        if (flipkartEnable != null) {
            cVar.bindLong(19, flipkartEnable.booleanValue() ? 1L : 0L);
        }
        Boolean calendarEnable = messagePush.getCalendarEnable();
        if (calendarEnable != null) {
            cVar.bindLong(20, calendarEnable.booleanValue() ? 1L : 0L);
        }
        Boolean outlookEnable = messagePush.getOutlookEnable();
        if (outlookEnable != null) {
            cVar.bindLong(21, outlookEnable.booleanValue() ? 1L : 0L);
        }
        Boolean dailhuntEnable = messagePush.getDailhuntEnable();
        if (dailhuntEnable != null) {
            cVar.bindLong(22, dailhuntEnable.booleanValue() ? 1L : 0L);
        }
        Boolean phonepeEnable = messagePush.getPhonepeEnable();
        if (phonepeEnable != null) {
            cVar.bindLong(23, phonepeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean inshortsEnable = messagePush.getInshortsEnable();
        if (inshortsEnable != null) {
            cVar.bindLong(24, inshortsEnable.booleanValue() ? 1L : 0L);
        }
        Boolean swiggyEnable = messagePush.getSwiggyEnable();
        if (swiggyEnable != null) {
            cVar.bindLong(25, swiggyEnable.booleanValue() ? 1L : 0L);
        }
        Boolean zomatoEnable = messagePush.getZomatoEnable();
        if (zomatoEnable != null) {
            cVar.bindLong(26, zomatoEnable.booleanValue() ? 1L : 0L);
        }
        Boolean olaEnable = messagePush.getOlaEnable();
        if (olaEnable != null) {
            cVar.bindLong(27, olaEnable.booleanValue() ? 1L : 0L);
        }
        Boolean reflexappEnable = messagePush.getReflexappEnable();
        if (reflexappEnable != null) {
            cVar.bindLong(28, reflexappEnable.booleanValue() ? 1L : 0L);
        }
        Boolean snapchatEnable = messagePush.getSnapchatEnable();
        if (snapchatEnable != null) {
            cVar.bindLong(29, snapchatEnable.booleanValue() ? 1L : 0L);
        }
        Boolean uberEnable = messagePush.getUberEnable();
        if (uberEnable != null) {
            cVar.bindLong(30, uberEnable.booleanValue() ? 1L : 0L);
        }
        Boolean youtubeEnable = messagePush.getYoutubeEnable();
        if (youtubeEnable != null) {
            cVar.bindLong(31, youtubeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean linkedinEnable = messagePush.getLinkedinEnable();
        if (linkedinEnable != null) {
            cVar.bindLong(32, linkedinEnable.booleanValue() ? 1L : 0L);
        }
        Boolean paytmEnable = messagePush.getPaytmEnable();
        if (paytmEnable != null) {
            cVar.bindLong(33, paytmEnable.booleanValue() ? 1L : 0L);
        }
        Boolean amazonEnable = messagePush.getAmazonEnable();
        if (amazonEnable != null) {
            cVar.bindLong(34, amazonEnable.booleanValue() ? 1L : 0L);
        }
        Boolean netflixEnable = messagePush.getNetflixEnable();
        if (netflixEnable != null) {
            cVar.bindLong(35, netflixEnable.booleanValue() ? 1L : 0L);
        }
        Boolean gpayEnable = messagePush.getGpayEnable();
        if (gpayEnable != null) {
            cVar.bindLong(36, gpayEnable.booleanValue() ? 1L : 0L);
        }
        Boolean yahooEnable = messagePush.getYahooEnable();
        if (yahooEnable != null) {
            cVar.bindLong(37, yahooEnable.booleanValue() ? 1L : 0L);
        }
        Boolean googleChatEnable = messagePush.getGoogleChatEnable();
        if (googleChatEnable != null) {
            cVar.bindLong(38, googleChatEnable.booleanValue() ? 1L : 0L);
        }
        Boolean amazonPrimeEnable = messagePush.getAmazonPrimeEnable();
        if (amazonPrimeEnable != null) {
            cVar.bindLong(39, amazonPrimeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean ytmusicEnable = messagePush.getYtmusicEnable();
        if (ytmusicEnable != null) {
            cVar.bindLong(40, ytmusicEnable.booleanValue() ? 1L : 0L);
        }
        Boolean dunzoEnable = messagePush.getDunzoEnable();
        if (dunzoEnable != null) {
            cVar.bindLong(41, dunzoEnable.booleanValue() ? 1L : 0L);
        }
        Boolean driveEnable = messagePush.getDriveEnable();
        if (driveEnable != null) {
            cVar.bindLong(42, driveEnable.booleanValue() ? 1L : 0L);
        }
        Boolean gaanaEnable = messagePush.getGaanaEnable();
        if (gaanaEnable != null) {
            cVar.bindLong(43, gaanaEnable.booleanValue() ? 1L : 0L);
        }
        Boolean zaloEnable = messagePush.getZaloEnable();
        if (zaloEnable != null) {
            cVar.bindLong(44, zaloEnable.booleanValue() ? 1L : 0L);
        }
        Boolean emailEnable = messagePush.getEmailEnable();
        if (emailEnable != null) {
            cVar.bindLong(45, emailEnable.booleanValue() ? 1L : 0L);
        }
        Boolean hotstarEnable = messagePush.getHotstarEnable();
        if (hotstarEnable != null) {
            cVar.bindLong(46, hotstarEnable.booleanValue() ? 1L : 0L);
        }
        Boolean wynkEnable = messagePush.getWynkEnable();
        if (wynkEnable != null) {
            cVar.bindLong(47, wynkEnable.booleanValue() ? 1L : 0L);
        }
        Boolean googleDriveEnable = messagePush.getGoogleDriveEnable();
        if (googleDriveEnable != null) {
            cVar.bindLong(48, googleDriveEnable.booleanValue() ? 1L : 0L);
        }
        Boolean missCallEnable = messagePush.getMissCallEnable();
        if (missCallEnable != null) {
            cVar.bindLong(49, missCallEnable.booleanValue() ? 1L : 0L);
        }
        Boolean whatsAppBusinessEnable = messagePush.getWhatsAppBusinessEnable();
        if (whatsAppBusinessEnable != null) {
            cVar.bindLong(50, whatsAppBusinessEnable.booleanValue() ? 1L : 0L);
        }
        Boolean dingtalkEnable = messagePush.getDingtalkEnable();
        if (dingtalkEnable != null) {
            cVar.bindLong(51, dingtalkEnable.booleanValue() ? 1L : 0L);
        }
        Boolean tiktokEnable = messagePush.getTiktokEnable();
        if (tiktokEnable != null) {
            cVar.bindLong(52, tiktokEnable.booleanValue() ? 1L : 0L);
        }
        Boolean lyftEnable = messagePush.getLyftEnable();
        if (lyftEnable != null) {
            cVar.bindLong(53, lyftEnable.booleanValue() ? 1L : 0L);
        }
        Boolean googleMapsEnable = messagePush.getGoogleMapsEnable();
        if (googleMapsEnable != null) {
            cVar.bindLong(54, googleMapsEnable.booleanValue() ? 1L : 0L);
        }
        Boolean slackEnable = messagePush.getSlackEnable();
        if (slackEnable != null) {
            cVar.bindLong(55, slackEnable.booleanValue() ? 1L : 0L);
        }
        Boolean microsoftTeamsEnable = messagePush.getMicrosoftTeamsEnable();
        if (microsoftTeamsEnable != null) {
            cVar.bindLong(56, microsoftTeamsEnable.booleanValue() ? 1L : 0L);
        }
        Boolean mormaiiSmartwatchesEnable = messagePush.getMormaiiSmartwatchesEnable();
        if (mormaiiSmartwatchesEnable != null) {
            cVar.bindLong(57, mormaiiSmartwatchesEnable.booleanValue() ? 1L : 0L);
        }
        Boolean redditEnable = messagePush.getRedditEnable();
        if (redditEnable != null) {
            cVar.bindLong(58, redditEnable.booleanValue() ? 1L : 0L);
        }
        Boolean discordEnable = messagePush.getDiscordEnable();
        if (discordEnable != null) {
            cVar.bindLong(59, discordEnable.booleanValue() ? 1L : 0L);
        }
        Boolean defaultCalendarEnable = messagePush.getDefaultCalendarEnable();
        if (defaultCalendarEnable != null) {
            cVar.bindLong(60, defaultCalendarEnable.booleanValue() ? 1L : 0L);
        }
        Boolean gojekEnable = messagePush.getGojekEnable();
        if (gojekEnable != null) {
            cVar.bindLong(61, gojekEnable.booleanValue() ? 1L : 0L);
        }
        Boolean larkEnable = messagePush.getLarkEnable();
        if (larkEnable != null) {
            cVar.bindLong(62, larkEnable.booleanValue() ? 1L : 0L);
        }
        Boolean garbEnable = messagePush.getGarbEnable();
        if (garbEnable != null) {
            cVar.bindLong(63, garbEnable.booleanValue() ? 1L : 0L);
        }
        Boolean shopeeEnable = messagePush.getShopeeEnable();
        if (shopeeEnable != null) {
            cVar.bindLong(64, shopeeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean tokopediaEnable = messagePush.getTokopediaEnable();
        if (tokopediaEnable != null) {
            cVar.bindLong(65, tokopediaEnable.booleanValue() ? 1L : 0L);
        }
        Boolean threadsEnable = messagePush.getThreadsEnable();
        if (threadsEnable != null) {
            cVar.bindLong(66, threadsEnable.booleanValue() ? 1L : 0L);
        }
        Boolean smartgoodsEnable = messagePush.getSmartgoodsEnable();
        if (smartgoodsEnable != null) {
            cVar.bindLong(67, smartgoodsEnable.booleanValue() ? 1L : 0L);
        }
    }

    @Override // org.greenrobot.greendao.a
    public MessagePush readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Boolean valueOf5;
        Boolean valueOf6;
        Boolean valueOf7;
        Boolean valueOf8;
        Boolean valueOf9;
        Boolean valueOf10;
        Boolean valueOf11;
        Boolean valueOf12;
        Boolean valueOf13;
        Boolean valueOf14;
        Boolean valueOf15;
        Boolean valueOf16;
        Boolean valueOf17;
        Boolean valueOf18;
        Boolean valueOf19;
        Boolean valueOf20;
        Boolean valueOf21;
        Boolean valueOf22;
        Boolean valueOf23;
        Boolean valueOf24;
        Boolean valueOf25;
        Boolean valueOf26;
        Boolean valueOf27;
        Boolean valueOf28;
        Boolean valueOf29;
        Boolean valueOf30;
        Boolean valueOf31;
        Boolean valueOf32;
        Boolean valueOf33;
        Boolean valueOf34;
        Boolean valueOf35;
        Boolean valueOf36;
        Boolean valueOf37;
        Boolean valueOf38;
        Boolean valueOf39;
        Boolean valueOf40;
        Boolean valueOf41;
        Boolean valueOf42;
        Boolean valueOf43;
        Boolean valueOf44;
        Boolean valueOf45;
        Boolean valueOf46;
        Boolean valueOf47;
        Boolean valueOf48;
        Boolean valueOf49;
        Boolean valueOf50;
        Boolean valueOf51;
        Boolean valueOf52;
        Boolean valueOf53;
        Boolean valueOf54;
        Boolean valueOf55;
        Boolean valueOf56;
        Boolean valueOf57;
        Boolean valueOf58;
        Boolean valueOf59;
        Boolean valueOf60;
        Boolean valueOf61;
        Boolean valueOf62;
        Boolean valueOf63;
        Boolean valueOf64;
        Boolean valueOf65;
        Boolean valueOf66;
        Long valueOf67 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        if (cursor.isNull(i9)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        int i10 = i8 + 2;
        if (cursor.isNull(i10)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        int i11 = i8 + 3;
        if (cursor.isNull(i11)) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        int i12 = i8 + 4;
        if (cursor.isNull(i12)) {
            valueOf4 = null;
        } else {
            valueOf4 = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        int i13 = i8 + 5;
        if (cursor.isNull(i13)) {
            valueOf5 = null;
        } else {
            valueOf5 = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        int i14 = i8 + 6;
        if (cursor.isNull(i14)) {
            valueOf6 = null;
        } else {
            valueOf6 = Boolean.valueOf(cursor.getShort(i14) != 0);
        }
        int i15 = i8 + 7;
        if (cursor.isNull(i15)) {
            valueOf7 = null;
        } else {
            valueOf7 = Boolean.valueOf(cursor.getShort(i15) != 0);
        }
        int i16 = i8 + 8;
        if (cursor.isNull(i16)) {
            valueOf8 = null;
        } else {
            valueOf8 = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        int i17 = i8 + 9;
        if (cursor.isNull(i17)) {
            valueOf9 = null;
        } else {
            valueOf9 = Boolean.valueOf(cursor.getShort(i17) != 0);
        }
        int i18 = i8 + 10;
        if (cursor.isNull(i18)) {
            valueOf10 = null;
        } else {
            valueOf10 = Boolean.valueOf(cursor.getShort(i18) != 0);
        }
        int i19 = i8 + 11;
        if (cursor.isNull(i19)) {
            valueOf11 = null;
        } else {
            valueOf11 = Boolean.valueOf(cursor.getShort(i19) != 0);
        }
        int i20 = i8 + 12;
        if (cursor.isNull(i20)) {
            valueOf12 = null;
        } else {
            valueOf12 = Boolean.valueOf(cursor.getShort(i20) != 0);
        }
        int i21 = i8 + 13;
        if (cursor.isNull(i21)) {
            valueOf13 = null;
        } else {
            valueOf13 = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        int i22 = i8 + 14;
        if (cursor.isNull(i22)) {
            valueOf14 = null;
        } else {
            valueOf14 = Boolean.valueOf(cursor.getShort(i22) != 0);
        }
        int i23 = i8 + 15;
        if (cursor.isNull(i23)) {
            valueOf15 = null;
        } else {
            valueOf15 = Boolean.valueOf(cursor.getShort(i23) != 0);
        }
        int i24 = i8 + 16;
        if (cursor.isNull(i24)) {
            valueOf16 = null;
        } else {
            valueOf16 = Boolean.valueOf(cursor.getShort(i24) != 0);
        }
        int i25 = i8 + 17;
        if (cursor.isNull(i25)) {
            valueOf17 = null;
        } else {
            valueOf17 = Boolean.valueOf(cursor.getShort(i25) != 0);
        }
        int i26 = i8 + 18;
        if (cursor.isNull(i26)) {
            valueOf18 = null;
        } else {
            valueOf18 = Boolean.valueOf(cursor.getShort(i26) != 0);
        }
        int i27 = i8 + 19;
        if (cursor.isNull(i27)) {
            valueOf19 = null;
        } else {
            valueOf19 = Boolean.valueOf(cursor.getShort(i27) != 0);
        }
        int i28 = i8 + 20;
        if (cursor.isNull(i28)) {
            valueOf20 = null;
        } else {
            valueOf20 = Boolean.valueOf(cursor.getShort(i28) != 0);
        }
        int i29 = i8 + 21;
        if (cursor.isNull(i29)) {
            valueOf21 = null;
        } else {
            valueOf21 = Boolean.valueOf(cursor.getShort(i29) != 0);
        }
        int i30 = i8 + 22;
        if (cursor.isNull(i30)) {
            valueOf22 = null;
        } else {
            valueOf22 = Boolean.valueOf(cursor.getShort(i30) != 0);
        }
        int i31 = i8 + 23;
        if (cursor.isNull(i31)) {
            valueOf23 = null;
        } else {
            valueOf23 = Boolean.valueOf(cursor.getShort(i31) != 0);
        }
        int i32 = i8 + 24;
        if (cursor.isNull(i32)) {
            valueOf24 = null;
        } else {
            valueOf24 = Boolean.valueOf(cursor.getShort(i32) != 0);
        }
        int i33 = i8 + 25;
        if (cursor.isNull(i33)) {
            valueOf25 = null;
        } else {
            valueOf25 = Boolean.valueOf(cursor.getShort(i33) != 0);
        }
        int i34 = i8 + 26;
        if (cursor.isNull(i34)) {
            valueOf26 = null;
        } else {
            valueOf26 = Boolean.valueOf(cursor.getShort(i34) != 0);
        }
        int i35 = i8 + 27;
        if (cursor.isNull(i35)) {
            valueOf27 = null;
        } else {
            valueOf27 = Boolean.valueOf(cursor.getShort(i35) != 0);
        }
        int i36 = i8 + 28;
        if (cursor.isNull(i36)) {
            valueOf28 = null;
        } else {
            valueOf28 = Boolean.valueOf(cursor.getShort(i36) != 0);
        }
        int i37 = i8 + 29;
        if (cursor.isNull(i37)) {
            valueOf29 = null;
        } else {
            valueOf29 = Boolean.valueOf(cursor.getShort(i37) != 0);
        }
        int i38 = i8 + 30;
        if (cursor.isNull(i38)) {
            valueOf30 = null;
        } else {
            valueOf30 = Boolean.valueOf(cursor.getShort(i38) != 0);
        }
        int i39 = i8 + 31;
        if (cursor.isNull(i39)) {
            valueOf31 = null;
        } else {
            valueOf31 = Boolean.valueOf(cursor.getShort(i39) != 0);
        }
        int i40 = i8 + 32;
        if (cursor.isNull(i40)) {
            valueOf32 = null;
        } else {
            valueOf32 = Boolean.valueOf(cursor.getShort(i40) != 0);
        }
        int i41 = i8 + 33;
        if (cursor.isNull(i41)) {
            valueOf33 = null;
        } else {
            valueOf33 = Boolean.valueOf(cursor.getShort(i41) != 0);
        }
        int i42 = i8 + 34;
        if (cursor.isNull(i42)) {
            valueOf34 = null;
        } else {
            valueOf34 = Boolean.valueOf(cursor.getShort(i42) != 0);
        }
        int i43 = i8 + 35;
        if (cursor.isNull(i43)) {
            valueOf35 = null;
        } else {
            valueOf35 = Boolean.valueOf(cursor.getShort(i43) != 0);
        }
        int i44 = i8 + 36;
        if (cursor.isNull(i44)) {
            valueOf36 = null;
        } else {
            valueOf36 = Boolean.valueOf(cursor.getShort(i44) != 0);
        }
        int i45 = i8 + 37;
        if (cursor.isNull(i45)) {
            valueOf37 = null;
        } else {
            valueOf37 = Boolean.valueOf(cursor.getShort(i45) != 0);
        }
        int i46 = i8 + 38;
        if (cursor.isNull(i46)) {
            valueOf38 = null;
        } else {
            valueOf38 = Boolean.valueOf(cursor.getShort(i46) != 0);
        }
        int i47 = i8 + 39;
        if (cursor.isNull(i47)) {
            valueOf39 = null;
        } else {
            valueOf39 = Boolean.valueOf(cursor.getShort(i47) != 0);
        }
        int i48 = i8 + 40;
        if (cursor.isNull(i48)) {
            valueOf40 = null;
        } else {
            valueOf40 = Boolean.valueOf(cursor.getShort(i48) != 0);
        }
        int i49 = i8 + 41;
        if (cursor.isNull(i49)) {
            valueOf41 = null;
        } else {
            valueOf41 = Boolean.valueOf(cursor.getShort(i49) != 0);
        }
        int i50 = i8 + 42;
        if (cursor.isNull(i50)) {
            valueOf42 = null;
        } else {
            valueOf42 = Boolean.valueOf(cursor.getShort(i50) != 0);
        }
        int i51 = i8 + 43;
        if (cursor.isNull(i51)) {
            valueOf43 = null;
        } else {
            valueOf43 = Boolean.valueOf(cursor.getShort(i51) != 0);
        }
        int i52 = i8 + 44;
        if (cursor.isNull(i52)) {
            valueOf44 = null;
        } else {
            valueOf44 = Boolean.valueOf(cursor.getShort(i52) != 0);
        }
        int i53 = i8 + 45;
        if (cursor.isNull(i53)) {
            valueOf45 = null;
        } else {
            valueOf45 = Boolean.valueOf(cursor.getShort(i53) != 0);
        }
        int i54 = i8 + 46;
        if (cursor.isNull(i54)) {
            valueOf46 = null;
        } else {
            valueOf46 = Boolean.valueOf(cursor.getShort(i54) != 0);
        }
        int i55 = i8 + 47;
        if (cursor.isNull(i55)) {
            valueOf47 = null;
        } else {
            valueOf47 = Boolean.valueOf(cursor.getShort(i55) != 0);
        }
        int i56 = i8 + 48;
        if (cursor.isNull(i56)) {
            valueOf48 = null;
        } else {
            valueOf48 = Boolean.valueOf(cursor.getShort(i56) != 0);
        }
        int i57 = i8 + 49;
        if (cursor.isNull(i57)) {
            valueOf49 = null;
        } else {
            valueOf49 = Boolean.valueOf(cursor.getShort(i57) != 0);
        }
        int i58 = i8 + 50;
        if (cursor.isNull(i58)) {
            valueOf50 = null;
        } else {
            valueOf50 = Boolean.valueOf(cursor.getShort(i58) != 0);
        }
        int i59 = i8 + 51;
        if (cursor.isNull(i59)) {
            valueOf51 = null;
        } else {
            valueOf51 = Boolean.valueOf(cursor.getShort(i59) != 0);
        }
        int i60 = i8 + 52;
        if (cursor.isNull(i60)) {
            valueOf52 = null;
        } else {
            valueOf52 = Boolean.valueOf(cursor.getShort(i60) != 0);
        }
        int i61 = i8 + 53;
        if (cursor.isNull(i61)) {
            valueOf53 = null;
        } else {
            valueOf53 = Boolean.valueOf(cursor.getShort(i61) != 0);
        }
        int i62 = i8 + 54;
        if (cursor.isNull(i62)) {
            valueOf54 = null;
        } else {
            valueOf54 = Boolean.valueOf(cursor.getShort(i62) != 0);
        }
        int i63 = i8 + 55;
        if (cursor.isNull(i63)) {
            valueOf55 = null;
        } else {
            valueOf55 = Boolean.valueOf(cursor.getShort(i63) != 0);
        }
        int i64 = i8 + 56;
        if (cursor.isNull(i64)) {
            valueOf56 = null;
        } else {
            valueOf56 = Boolean.valueOf(cursor.getShort(i64) != 0);
        }
        int i65 = i8 + 57;
        if (cursor.isNull(i65)) {
            valueOf57 = null;
        } else {
            valueOf57 = Boolean.valueOf(cursor.getShort(i65) != 0);
        }
        int i66 = i8 + 58;
        if (cursor.isNull(i66)) {
            valueOf58 = null;
        } else {
            valueOf58 = Boolean.valueOf(cursor.getShort(i66) != 0);
        }
        int i67 = i8 + 59;
        if (cursor.isNull(i67)) {
            valueOf59 = null;
        } else {
            valueOf59 = Boolean.valueOf(cursor.getShort(i67) != 0);
        }
        int i68 = i8 + 60;
        if (cursor.isNull(i68)) {
            valueOf60 = null;
        } else {
            valueOf60 = Boolean.valueOf(cursor.getShort(i68) != 0);
        }
        int i69 = i8 + 61;
        if (cursor.isNull(i69)) {
            valueOf61 = null;
        } else {
            valueOf61 = Boolean.valueOf(cursor.getShort(i69) != 0);
        }
        int i70 = i8 + 62;
        if (cursor.isNull(i70)) {
            valueOf62 = null;
        } else {
            valueOf62 = Boolean.valueOf(cursor.getShort(i70) != 0);
        }
        int i71 = i8 + 63;
        if (cursor.isNull(i71)) {
            valueOf63 = null;
        } else {
            valueOf63 = Boolean.valueOf(cursor.getShort(i71) != 0);
        }
        int i72 = i8 + 64;
        if (cursor.isNull(i72)) {
            valueOf64 = null;
        } else {
            valueOf64 = Boolean.valueOf(cursor.getShort(i72) != 0);
        }
        int i73 = i8 + 65;
        if (cursor.isNull(i73)) {
            valueOf65 = null;
        } else {
            valueOf65 = Boolean.valueOf(cursor.getShort(i73) != 0);
        }
        int i74 = i8 + 66;
        if (cursor.isNull(i74)) {
            valueOf66 = null;
        } else {
            valueOf66 = Boolean.valueOf(cursor.getShort(i74) != 0);
        }
        return new MessagePush(valueOf67, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, valueOf64, valueOf65, valueOf66);
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, MessagePush messagePush, int i8) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Boolean valueOf5;
        Boolean valueOf6;
        Boolean valueOf7;
        Boolean valueOf8;
        Boolean valueOf9;
        Boolean valueOf10;
        Boolean valueOf11;
        Boolean valueOf12;
        Boolean valueOf13;
        Boolean valueOf14;
        Boolean valueOf15;
        Boolean valueOf16;
        Boolean valueOf17;
        Boolean valueOf18;
        Boolean valueOf19;
        Boolean valueOf20;
        Boolean valueOf21;
        Boolean valueOf22;
        Boolean valueOf23;
        Boolean valueOf24;
        Boolean valueOf25;
        Boolean valueOf26;
        Boolean valueOf27;
        Boolean valueOf28;
        Boolean valueOf29;
        Boolean valueOf30;
        Boolean valueOf31;
        Boolean valueOf32;
        Boolean valueOf33;
        Boolean valueOf34;
        Boolean valueOf35;
        Boolean valueOf36;
        Boolean valueOf37;
        Boolean valueOf38;
        Boolean valueOf39;
        Boolean valueOf40;
        Boolean valueOf41;
        Boolean valueOf42;
        Boolean valueOf43;
        Boolean valueOf44;
        Boolean valueOf45;
        Boolean valueOf46;
        Boolean valueOf47;
        Boolean valueOf48;
        Boolean valueOf49;
        Boolean valueOf50;
        Boolean valueOf51;
        Boolean valueOf52;
        Boolean valueOf53;
        Boolean valueOf54;
        Boolean valueOf55;
        Boolean valueOf56;
        Boolean valueOf57;
        Boolean valueOf58;
        Boolean valueOf59;
        Boolean valueOf60;
        Boolean valueOf61;
        Boolean valueOf62;
        Boolean valueOf63;
        Boolean valueOf64;
        Boolean valueOf65;
        Boolean bool = null;
        messagePush.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        if (cursor.isNull(i9)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        messagePush.setPhoneEnable(valueOf);
        int i10 = i8 + 2;
        if (cursor.isNull(i10)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        messagePush.setMessageEnable(valueOf2);
        int i11 = i8 + 3;
        if (cursor.isNull(i11)) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        messagePush.setQqEnable(valueOf3);
        int i12 = i8 + 4;
        if (cursor.isNull(i12)) {
            valueOf4 = null;
        } else {
            valueOf4 = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        messagePush.setWechatEnable(valueOf4);
        int i13 = i8 + 5;
        if (cursor.isNull(i13)) {
            valueOf5 = null;
        } else {
            valueOf5 = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        messagePush.setFacebookeEnable(valueOf5);
        int i14 = i8 + 6;
        if (cursor.isNull(i14)) {
            valueOf6 = null;
        } else {
            valueOf6 = Boolean.valueOf(cursor.getShort(i14) != 0);
        }
        messagePush.setMessengerEnable(valueOf6);
        int i15 = i8 + 7;
        if (cursor.isNull(i15)) {
            valueOf7 = null;
        } else {
            valueOf7 = Boolean.valueOf(cursor.getShort(i15) != 0);
        }
        messagePush.setTwitterEnable(valueOf7);
        int i16 = i8 + 8;
        if (cursor.isNull(i16)) {
            valueOf8 = null;
        } else {
            valueOf8 = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        messagePush.setKakaotalkEnable(valueOf8);
        int i17 = i8 + 9;
        if (cursor.isNull(i17)) {
            valueOf9 = null;
        } else {
            valueOf9 = Boolean.valueOf(cursor.getShort(i17) != 0);
        }
        messagePush.setLineEnable(valueOf9);
        int i18 = i8 + 10;
        if (cursor.isNull(i18)) {
            valueOf10 = null;
        } else {
            valueOf10 = Boolean.valueOf(cursor.getShort(i18) != 0);
        }
        messagePush.setWhatsappEnable(valueOf10);
        int i19 = i8 + 11;
        if (cursor.isNull(i19)) {
            valueOf11 = null;
        } else {
            valueOf11 = Boolean.valueOf(cursor.getShort(i19) != 0);
        }
        messagePush.setInstagramEnable(valueOf11);
        int i20 = i8 + 12;
        if (cursor.isNull(i20)) {
            valueOf12 = null;
        } else {
            valueOf12 = Boolean.valueOf(cursor.getShort(i20) != 0);
        }
        messagePush.setSkypeEnable(valueOf12);
        int i21 = i8 + 13;
        if (cursor.isNull(i21)) {
            valueOf13 = null;
        } else {
            valueOf13 = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        messagePush.setOthersEnable(valueOf13);
        int i22 = i8 + 14;
        if (cursor.isNull(i22)) {
            valueOf14 = null;
        } else {
            valueOf14 = Boolean.valueOf(cursor.getShort(i22) != 0);
        }
        messagePush.setGmailEnable(valueOf14);
        int i23 = i8 + 15;
        if (cursor.isNull(i23)) {
            valueOf15 = null;
        } else {
            valueOf15 = Boolean.valueOf(cursor.getShort(i23) != 0);
        }
        messagePush.setTelegramEnable(valueOf15);
        int i24 = i8 + 16;
        if (cursor.isNull(i24)) {
            valueOf16 = null;
        } else {
            valueOf16 = Boolean.valueOf(cursor.getShort(i24) != 0);
        }
        messagePush.setViberEnable(valueOf16);
        int i25 = i8 + 17;
        if (cursor.isNull(i25)) {
            valueOf17 = null;
        } else {
            valueOf17 = Boolean.valueOf(cursor.getShort(i25) != 0);
        }
        messagePush.setNateOnEnable(valueOf17);
        int i26 = i8 + 18;
        if (cursor.isNull(i26)) {
            valueOf18 = null;
        } else {
            valueOf18 = Boolean.valueOf(cursor.getShort(i26) != 0);
        }
        messagePush.setFlipkartEnable(valueOf18);
        int i27 = i8 + 19;
        if (cursor.isNull(i27)) {
            valueOf19 = null;
        } else {
            valueOf19 = Boolean.valueOf(cursor.getShort(i27) != 0);
        }
        messagePush.setCalendarEnable(valueOf19);
        int i28 = i8 + 20;
        if (cursor.isNull(i28)) {
            valueOf20 = null;
        } else {
            valueOf20 = Boolean.valueOf(cursor.getShort(i28) != 0);
        }
        messagePush.setOutlookEnable(valueOf20);
        int i29 = i8 + 21;
        if (cursor.isNull(i29)) {
            valueOf21 = null;
        } else {
            valueOf21 = Boolean.valueOf(cursor.getShort(i29) != 0);
        }
        messagePush.setDailhuntEnable(valueOf21);
        int i30 = i8 + 22;
        if (cursor.isNull(i30)) {
            valueOf22 = null;
        } else {
            valueOf22 = Boolean.valueOf(cursor.getShort(i30) != 0);
        }
        messagePush.setPhonepeEnable(valueOf22);
        int i31 = i8 + 23;
        if (cursor.isNull(i31)) {
            valueOf23 = null;
        } else {
            valueOf23 = Boolean.valueOf(cursor.getShort(i31) != 0);
        }
        messagePush.setInshortsEnable(valueOf23);
        int i32 = i8 + 24;
        if (cursor.isNull(i32)) {
            valueOf24 = null;
        } else {
            valueOf24 = Boolean.valueOf(cursor.getShort(i32) != 0);
        }
        messagePush.setSwiggyEnable(valueOf24);
        int i33 = i8 + 25;
        if (cursor.isNull(i33)) {
            valueOf25 = null;
        } else {
            valueOf25 = Boolean.valueOf(cursor.getShort(i33) != 0);
        }
        messagePush.setZomatoEnable(valueOf25);
        int i34 = i8 + 26;
        if (cursor.isNull(i34)) {
            valueOf26 = null;
        } else {
            valueOf26 = Boolean.valueOf(cursor.getShort(i34) != 0);
        }
        messagePush.setOlaEnable(valueOf26);
        int i35 = i8 + 27;
        if (cursor.isNull(i35)) {
            valueOf27 = null;
        } else {
            valueOf27 = Boolean.valueOf(cursor.getShort(i35) != 0);
        }
        messagePush.setReflexappEnable(valueOf27);
        int i36 = i8 + 28;
        if (cursor.isNull(i36)) {
            valueOf28 = null;
        } else {
            valueOf28 = Boolean.valueOf(cursor.getShort(i36) != 0);
        }
        messagePush.setSnapchatEnable(valueOf28);
        int i37 = i8 + 29;
        if (cursor.isNull(i37)) {
            valueOf29 = null;
        } else {
            valueOf29 = Boolean.valueOf(cursor.getShort(i37) != 0);
        }
        messagePush.setUberEnable(valueOf29);
        int i38 = i8 + 30;
        if (cursor.isNull(i38)) {
            valueOf30 = null;
        } else {
            valueOf30 = Boolean.valueOf(cursor.getShort(i38) != 0);
        }
        messagePush.setYoutubeEnable(valueOf30);
        int i39 = i8 + 31;
        if (cursor.isNull(i39)) {
            valueOf31 = null;
        } else {
            valueOf31 = Boolean.valueOf(cursor.getShort(i39) != 0);
        }
        messagePush.setLinkedinEnable(valueOf31);
        int i40 = i8 + 32;
        if (cursor.isNull(i40)) {
            valueOf32 = null;
        } else {
            valueOf32 = Boolean.valueOf(cursor.getShort(i40) != 0);
        }
        messagePush.setPaytmEnable(valueOf32);
        int i41 = i8 + 33;
        if (cursor.isNull(i41)) {
            valueOf33 = null;
        } else {
            valueOf33 = Boolean.valueOf(cursor.getShort(i41) != 0);
        }
        messagePush.setAmazonEnable(valueOf33);
        int i42 = i8 + 34;
        if (cursor.isNull(i42)) {
            valueOf34 = null;
        } else {
            valueOf34 = Boolean.valueOf(cursor.getShort(i42) != 0);
        }
        messagePush.setNetflixEnable(valueOf34);
        int i43 = i8 + 35;
        if (cursor.isNull(i43)) {
            valueOf35 = null;
        } else {
            valueOf35 = Boolean.valueOf(cursor.getShort(i43) != 0);
        }
        messagePush.setGpayEnable(valueOf35);
        int i44 = i8 + 36;
        if (cursor.isNull(i44)) {
            valueOf36 = null;
        } else {
            valueOf36 = Boolean.valueOf(cursor.getShort(i44) != 0);
        }
        messagePush.setYahooEnable(valueOf36);
        int i45 = i8 + 37;
        if (cursor.isNull(i45)) {
            valueOf37 = null;
        } else {
            valueOf37 = Boolean.valueOf(cursor.getShort(i45) != 0);
        }
        messagePush.setGoogleChatEnable(valueOf37);
        int i46 = i8 + 38;
        if (cursor.isNull(i46)) {
            valueOf38 = null;
        } else {
            valueOf38 = Boolean.valueOf(cursor.getShort(i46) != 0);
        }
        messagePush.setAmazonPrimeEnable(valueOf38);
        int i47 = i8 + 39;
        if (cursor.isNull(i47)) {
            valueOf39 = null;
        } else {
            valueOf39 = Boolean.valueOf(cursor.getShort(i47) != 0);
        }
        messagePush.setYtmusicEnable(valueOf39);
        int i48 = i8 + 40;
        if (cursor.isNull(i48)) {
            valueOf40 = null;
        } else {
            valueOf40 = Boolean.valueOf(cursor.getShort(i48) != 0);
        }
        messagePush.setDunzoEnable(valueOf40);
        int i49 = i8 + 41;
        if (cursor.isNull(i49)) {
            valueOf41 = null;
        } else {
            valueOf41 = Boolean.valueOf(cursor.getShort(i49) != 0);
        }
        messagePush.setDriveEnable(valueOf41);
        int i50 = i8 + 42;
        if (cursor.isNull(i50)) {
            valueOf42 = null;
        } else {
            valueOf42 = Boolean.valueOf(cursor.getShort(i50) != 0);
        }
        messagePush.setGaanaEnable(valueOf42);
        int i51 = i8 + 43;
        if (cursor.isNull(i51)) {
            valueOf43 = null;
        } else {
            valueOf43 = Boolean.valueOf(cursor.getShort(i51) != 0);
        }
        messagePush.setZaloEnable(valueOf43);
        int i52 = i8 + 44;
        if (cursor.isNull(i52)) {
            valueOf44 = null;
        } else {
            valueOf44 = Boolean.valueOf(cursor.getShort(i52) != 0);
        }
        messagePush.setEmailEnable(valueOf44);
        int i53 = i8 + 45;
        if (cursor.isNull(i53)) {
            valueOf45 = null;
        } else {
            valueOf45 = Boolean.valueOf(cursor.getShort(i53) != 0);
        }
        messagePush.setHotstarEnable(valueOf45);
        int i54 = i8 + 46;
        if (cursor.isNull(i54)) {
            valueOf46 = null;
        } else {
            valueOf46 = Boolean.valueOf(cursor.getShort(i54) != 0);
        }
        messagePush.setWynkEnable(valueOf46);
        int i55 = i8 + 47;
        if (cursor.isNull(i55)) {
            valueOf47 = null;
        } else {
            valueOf47 = Boolean.valueOf(cursor.getShort(i55) != 0);
        }
        messagePush.setGoogleDriveEnable(valueOf47);
        int i56 = i8 + 48;
        if (cursor.isNull(i56)) {
            valueOf48 = null;
        } else {
            valueOf48 = Boolean.valueOf(cursor.getShort(i56) != 0);
        }
        messagePush.setMissCallEnable(valueOf48);
        int i57 = i8 + 49;
        if (cursor.isNull(i57)) {
            valueOf49 = null;
        } else {
            valueOf49 = Boolean.valueOf(cursor.getShort(i57) != 0);
        }
        messagePush.setWhatsAppBusinessEnable(valueOf49);
        int i58 = i8 + 50;
        if (cursor.isNull(i58)) {
            valueOf50 = null;
        } else {
            valueOf50 = Boolean.valueOf(cursor.getShort(i58) != 0);
        }
        messagePush.setDingtalkEnable(valueOf50);
        int i59 = i8 + 51;
        if (cursor.isNull(i59)) {
            valueOf51 = null;
        } else {
            valueOf51 = Boolean.valueOf(cursor.getShort(i59) != 0);
        }
        messagePush.setTiktokEnable(valueOf51);
        int i60 = i8 + 52;
        if (cursor.isNull(i60)) {
            valueOf52 = null;
        } else {
            valueOf52 = Boolean.valueOf(cursor.getShort(i60) != 0);
        }
        messagePush.setLyftEnable(valueOf52);
        int i61 = i8 + 53;
        if (cursor.isNull(i61)) {
            valueOf53 = null;
        } else {
            valueOf53 = Boolean.valueOf(cursor.getShort(i61) != 0);
        }
        messagePush.setGoogleMapsEnable(valueOf53);
        int i62 = i8 + 54;
        if (cursor.isNull(i62)) {
            valueOf54 = null;
        } else {
            valueOf54 = Boolean.valueOf(cursor.getShort(i62) != 0);
        }
        messagePush.setSlackEnable(valueOf54);
        int i63 = i8 + 55;
        if (cursor.isNull(i63)) {
            valueOf55 = null;
        } else {
            valueOf55 = Boolean.valueOf(cursor.getShort(i63) != 0);
        }
        messagePush.setMicrosoftTeamsEnable(valueOf55);
        int i64 = i8 + 56;
        if (cursor.isNull(i64)) {
            valueOf56 = null;
        } else {
            valueOf56 = Boolean.valueOf(cursor.getShort(i64) != 0);
        }
        messagePush.setMormaiiSmartwatchesEnable(valueOf56);
        int i65 = i8 + 57;
        if (cursor.isNull(i65)) {
            valueOf57 = null;
        } else {
            valueOf57 = Boolean.valueOf(cursor.getShort(i65) != 0);
        }
        messagePush.setRedditEnable(valueOf57);
        int i66 = i8 + 58;
        if (cursor.isNull(i66)) {
            valueOf58 = null;
        } else {
            valueOf58 = Boolean.valueOf(cursor.getShort(i66) != 0);
        }
        messagePush.setDiscordEnable(valueOf58);
        int i67 = i8 + 59;
        if (cursor.isNull(i67)) {
            valueOf59 = null;
        } else {
            valueOf59 = Boolean.valueOf(cursor.getShort(i67) != 0);
        }
        messagePush.setDefaultCalendarEnable(valueOf59);
        int i68 = i8 + 60;
        if (cursor.isNull(i68)) {
            valueOf60 = null;
        } else {
            valueOf60 = Boolean.valueOf(cursor.getShort(i68) != 0);
        }
        messagePush.setGojekEnable(valueOf60);
        int i69 = i8 + 61;
        if (cursor.isNull(i69)) {
            valueOf61 = null;
        } else {
            valueOf61 = Boolean.valueOf(cursor.getShort(i69) != 0);
        }
        messagePush.setLarkEnable(valueOf61);
        int i70 = i8 + 62;
        if (cursor.isNull(i70)) {
            valueOf62 = null;
        } else {
            valueOf62 = Boolean.valueOf(cursor.getShort(i70) != 0);
        }
        messagePush.setGarbEnable(valueOf62);
        int i71 = i8 + 63;
        if (cursor.isNull(i71)) {
            valueOf63 = null;
        } else {
            valueOf63 = Boolean.valueOf(cursor.getShort(i71) != 0);
        }
        messagePush.setShopeeEnable(valueOf63);
        int i72 = i8 + 64;
        if (cursor.isNull(i72)) {
            valueOf64 = null;
        } else {
            valueOf64 = Boolean.valueOf(cursor.getShort(i72) != 0);
        }
        messagePush.setTokopediaEnable(valueOf64);
        int i73 = i8 + 65;
        if (cursor.isNull(i73)) {
            valueOf65 = null;
        } else {
            valueOf65 = Boolean.valueOf(cursor.getShort(i73) != 0);
        }
        messagePush.setThreadsEnable(valueOf65);
        int i74 = i8 + 66;
        if (!cursor.isNull(i74)) {
            bool = Boolean.valueOf(cursor.getShort(i74) != 0);
        }
        messagePush.setSmartgoodsEnable(bool);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, MessagePush messagePush) {
        sQLiteStatement.clearBindings();
        Long id = messagePush.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Boolean phoneEnable = messagePush.getPhoneEnable();
        if (phoneEnable != null) {
            sQLiteStatement.bindLong(2, phoneEnable.booleanValue() ? 1L : 0L);
        }
        Boolean messageEnable = messagePush.getMessageEnable();
        if (messageEnable != null) {
            sQLiteStatement.bindLong(3, messageEnable.booleanValue() ? 1L : 0L);
        }
        Boolean qqEnable = messagePush.getQqEnable();
        if (qqEnable != null) {
            sQLiteStatement.bindLong(4, qqEnable.booleanValue() ? 1L : 0L);
        }
        Boolean wechatEnable = messagePush.getWechatEnable();
        if (wechatEnable != null) {
            sQLiteStatement.bindLong(5, wechatEnable.booleanValue() ? 1L : 0L);
        }
        Boolean facebookeEnable = messagePush.getFacebookeEnable();
        if (facebookeEnable != null) {
            sQLiteStatement.bindLong(6, facebookeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean messengerEnable = messagePush.getMessengerEnable();
        if (messengerEnable != null) {
            sQLiteStatement.bindLong(7, messengerEnable.booleanValue() ? 1L : 0L);
        }
        Boolean twitterEnable = messagePush.getTwitterEnable();
        if (twitterEnable != null) {
            sQLiteStatement.bindLong(8, twitterEnable.booleanValue() ? 1L : 0L);
        }
        Boolean kakaotalkEnable = messagePush.getKakaotalkEnable();
        if (kakaotalkEnable != null) {
            sQLiteStatement.bindLong(9, kakaotalkEnable.booleanValue() ? 1L : 0L);
        }
        Boolean lineEnable = messagePush.getLineEnable();
        if (lineEnable != null) {
            sQLiteStatement.bindLong(10, lineEnable.booleanValue() ? 1L : 0L);
        }
        Boolean whatsappEnable = messagePush.getWhatsappEnable();
        if (whatsappEnable != null) {
            sQLiteStatement.bindLong(11, whatsappEnable.booleanValue() ? 1L : 0L);
        }
        Boolean instagramEnable = messagePush.getInstagramEnable();
        if (instagramEnable != null) {
            sQLiteStatement.bindLong(12, instagramEnable.booleanValue() ? 1L : 0L);
        }
        Boolean skypeEnable = messagePush.getSkypeEnable();
        if (skypeEnable != null) {
            sQLiteStatement.bindLong(13, skypeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean othersEnable = messagePush.getOthersEnable();
        if (othersEnable != null) {
            sQLiteStatement.bindLong(14, othersEnable.booleanValue() ? 1L : 0L);
        }
        Boolean gmailEnable = messagePush.getGmailEnable();
        if (gmailEnable != null) {
            sQLiteStatement.bindLong(15, gmailEnable.booleanValue() ? 1L : 0L);
        }
        Boolean telegramEnable = messagePush.getTelegramEnable();
        if (telegramEnable != null) {
            sQLiteStatement.bindLong(16, telegramEnable.booleanValue() ? 1L : 0L);
        }
        Boolean viberEnable = messagePush.getViberEnable();
        if (viberEnable != null) {
            sQLiteStatement.bindLong(17, viberEnable.booleanValue() ? 1L : 0L);
        }
        Boolean nateOnEnable = messagePush.getNateOnEnable();
        if (nateOnEnable != null) {
            sQLiteStatement.bindLong(18, nateOnEnable.booleanValue() ? 1L : 0L);
        }
        Boolean flipkartEnable = messagePush.getFlipkartEnable();
        if (flipkartEnable != null) {
            sQLiteStatement.bindLong(19, flipkartEnable.booleanValue() ? 1L : 0L);
        }
        Boolean calendarEnable = messagePush.getCalendarEnable();
        if (calendarEnable != null) {
            sQLiteStatement.bindLong(20, calendarEnable.booleanValue() ? 1L : 0L);
        }
        Boolean outlookEnable = messagePush.getOutlookEnable();
        if (outlookEnable != null) {
            sQLiteStatement.bindLong(21, outlookEnable.booleanValue() ? 1L : 0L);
        }
        Boolean dailhuntEnable = messagePush.getDailhuntEnable();
        if (dailhuntEnable != null) {
            sQLiteStatement.bindLong(22, dailhuntEnable.booleanValue() ? 1L : 0L);
        }
        Boolean phonepeEnable = messagePush.getPhonepeEnable();
        if (phonepeEnable != null) {
            sQLiteStatement.bindLong(23, phonepeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean inshortsEnable = messagePush.getInshortsEnable();
        if (inshortsEnable != null) {
            sQLiteStatement.bindLong(24, inshortsEnable.booleanValue() ? 1L : 0L);
        }
        Boolean swiggyEnable = messagePush.getSwiggyEnable();
        if (swiggyEnable != null) {
            sQLiteStatement.bindLong(25, swiggyEnable.booleanValue() ? 1L : 0L);
        }
        Boolean zomatoEnable = messagePush.getZomatoEnable();
        if (zomatoEnable != null) {
            sQLiteStatement.bindLong(26, zomatoEnable.booleanValue() ? 1L : 0L);
        }
        Boolean olaEnable = messagePush.getOlaEnable();
        if (olaEnable != null) {
            sQLiteStatement.bindLong(27, olaEnable.booleanValue() ? 1L : 0L);
        }
        Boolean reflexappEnable = messagePush.getReflexappEnable();
        if (reflexappEnable != null) {
            sQLiteStatement.bindLong(28, reflexappEnable.booleanValue() ? 1L : 0L);
        }
        Boolean snapchatEnable = messagePush.getSnapchatEnable();
        if (snapchatEnable != null) {
            sQLiteStatement.bindLong(29, snapchatEnable.booleanValue() ? 1L : 0L);
        }
        Boolean uberEnable = messagePush.getUberEnable();
        if (uberEnable != null) {
            sQLiteStatement.bindLong(30, uberEnable.booleanValue() ? 1L : 0L);
        }
        Boolean youtubeEnable = messagePush.getYoutubeEnable();
        if (youtubeEnable != null) {
            sQLiteStatement.bindLong(31, youtubeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean linkedinEnable = messagePush.getLinkedinEnable();
        if (linkedinEnable != null) {
            sQLiteStatement.bindLong(32, linkedinEnable.booleanValue() ? 1L : 0L);
        }
        Boolean paytmEnable = messagePush.getPaytmEnable();
        if (paytmEnable != null) {
            sQLiteStatement.bindLong(33, paytmEnable.booleanValue() ? 1L : 0L);
        }
        Boolean amazonEnable = messagePush.getAmazonEnable();
        if (amazonEnable != null) {
            sQLiteStatement.bindLong(34, amazonEnable.booleanValue() ? 1L : 0L);
        }
        Boolean netflixEnable = messagePush.getNetflixEnable();
        if (netflixEnable != null) {
            sQLiteStatement.bindLong(35, netflixEnable.booleanValue() ? 1L : 0L);
        }
        Boolean gpayEnable = messagePush.getGpayEnable();
        if (gpayEnable != null) {
            sQLiteStatement.bindLong(36, gpayEnable.booleanValue() ? 1L : 0L);
        }
        Boolean yahooEnable = messagePush.getYahooEnable();
        if (yahooEnable != null) {
            sQLiteStatement.bindLong(37, yahooEnable.booleanValue() ? 1L : 0L);
        }
        Boolean googleChatEnable = messagePush.getGoogleChatEnable();
        if (googleChatEnable != null) {
            sQLiteStatement.bindLong(38, googleChatEnable.booleanValue() ? 1L : 0L);
        }
        Boolean amazonPrimeEnable = messagePush.getAmazonPrimeEnable();
        if (amazonPrimeEnable != null) {
            sQLiteStatement.bindLong(39, amazonPrimeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean ytmusicEnable = messagePush.getYtmusicEnable();
        if (ytmusicEnable != null) {
            sQLiteStatement.bindLong(40, ytmusicEnable.booleanValue() ? 1L : 0L);
        }
        Boolean dunzoEnable = messagePush.getDunzoEnable();
        if (dunzoEnable != null) {
            sQLiteStatement.bindLong(41, dunzoEnable.booleanValue() ? 1L : 0L);
        }
        Boolean driveEnable = messagePush.getDriveEnable();
        if (driveEnable != null) {
            sQLiteStatement.bindLong(42, driveEnable.booleanValue() ? 1L : 0L);
        }
        Boolean gaanaEnable = messagePush.getGaanaEnable();
        if (gaanaEnable != null) {
            sQLiteStatement.bindLong(43, gaanaEnable.booleanValue() ? 1L : 0L);
        }
        Boolean zaloEnable = messagePush.getZaloEnable();
        if (zaloEnable != null) {
            sQLiteStatement.bindLong(44, zaloEnable.booleanValue() ? 1L : 0L);
        }
        Boolean emailEnable = messagePush.getEmailEnable();
        if (emailEnable != null) {
            sQLiteStatement.bindLong(45, emailEnable.booleanValue() ? 1L : 0L);
        }
        Boolean hotstarEnable = messagePush.getHotstarEnable();
        if (hotstarEnable != null) {
            sQLiteStatement.bindLong(46, hotstarEnable.booleanValue() ? 1L : 0L);
        }
        Boolean wynkEnable = messagePush.getWynkEnable();
        if (wynkEnable != null) {
            sQLiteStatement.bindLong(47, wynkEnable.booleanValue() ? 1L : 0L);
        }
        Boolean googleDriveEnable = messagePush.getGoogleDriveEnable();
        if (googleDriveEnable != null) {
            sQLiteStatement.bindLong(48, googleDriveEnable.booleanValue() ? 1L : 0L);
        }
        Boolean missCallEnable = messagePush.getMissCallEnable();
        if (missCallEnable != null) {
            sQLiteStatement.bindLong(49, missCallEnable.booleanValue() ? 1L : 0L);
        }
        Boolean whatsAppBusinessEnable = messagePush.getWhatsAppBusinessEnable();
        if (whatsAppBusinessEnable != null) {
            sQLiteStatement.bindLong(50, whatsAppBusinessEnable.booleanValue() ? 1L : 0L);
        }
        Boolean dingtalkEnable = messagePush.getDingtalkEnable();
        if (dingtalkEnable != null) {
            sQLiteStatement.bindLong(51, dingtalkEnable.booleanValue() ? 1L : 0L);
        }
        Boolean tiktokEnable = messagePush.getTiktokEnable();
        if (tiktokEnable != null) {
            sQLiteStatement.bindLong(52, tiktokEnable.booleanValue() ? 1L : 0L);
        }
        Boolean lyftEnable = messagePush.getLyftEnable();
        if (lyftEnable != null) {
            sQLiteStatement.bindLong(53, lyftEnable.booleanValue() ? 1L : 0L);
        }
        Boolean googleMapsEnable = messagePush.getGoogleMapsEnable();
        if (googleMapsEnable != null) {
            sQLiteStatement.bindLong(54, googleMapsEnable.booleanValue() ? 1L : 0L);
        }
        Boolean slackEnable = messagePush.getSlackEnable();
        if (slackEnable != null) {
            sQLiteStatement.bindLong(55, slackEnable.booleanValue() ? 1L : 0L);
        }
        Boolean microsoftTeamsEnable = messagePush.getMicrosoftTeamsEnable();
        if (microsoftTeamsEnable != null) {
            sQLiteStatement.bindLong(56, microsoftTeamsEnable.booleanValue() ? 1L : 0L);
        }
        Boolean mormaiiSmartwatchesEnable = messagePush.getMormaiiSmartwatchesEnable();
        if (mormaiiSmartwatchesEnable != null) {
            sQLiteStatement.bindLong(57, mormaiiSmartwatchesEnable.booleanValue() ? 1L : 0L);
        }
        Boolean redditEnable = messagePush.getRedditEnable();
        if (redditEnable != null) {
            sQLiteStatement.bindLong(58, redditEnable.booleanValue() ? 1L : 0L);
        }
        Boolean discordEnable = messagePush.getDiscordEnable();
        if (discordEnable != null) {
            sQLiteStatement.bindLong(59, discordEnable.booleanValue() ? 1L : 0L);
        }
        Boolean defaultCalendarEnable = messagePush.getDefaultCalendarEnable();
        if (defaultCalendarEnable != null) {
            sQLiteStatement.bindLong(60, defaultCalendarEnable.booleanValue() ? 1L : 0L);
        }
        Boolean gojekEnable = messagePush.getGojekEnable();
        if (gojekEnable != null) {
            sQLiteStatement.bindLong(61, gojekEnable.booleanValue() ? 1L : 0L);
        }
        Boolean larkEnable = messagePush.getLarkEnable();
        if (larkEnable != null) {
            sQLiteStatement.bindLong(62, larkEnable.booleanValue() ? 1L : 0L);
        }
        Boolean garbEnable = messagePush.getGarbEnable();
        if (garbEnable != null) {
            sQLiteStatement.bindLong(63, garbEnable.booleanValue() ? 1L : 0L);
        }
        Boolean shopeeEnable = messagePush.getShopeeEnable();
        if (shopeeEnable != null) {
            sQLiteStatement.bindLong(64, shopeeEnable.booleanValue() ? 1L : 0L);
        }
        Boolean tokopediaEnable = messagePush.getTokopediaEnable();
        if (tokopediaEnable != null) {
            sQLiteStatement.bindLong(65, tokopediaEnable.booleanValue() ? 1L : 0L);
        }
        Boolean threadsEnable = messagePush.getThreadsEnable();
        if (threadsEnable != null) {
            sQLiteStatement.bindLong(66, threadsEnable.booleanValue() ? 1L : 0L);
        }
        Boolean smartgoodsEnable = messagePush.getSmartgoodsEnable();
        if (smartgoodsEnable != null) {
            sQLiteStatement.bindLong(67, smartgoodsEnable.booleanValue() ? 1L : 0L);
        }
    }
}
