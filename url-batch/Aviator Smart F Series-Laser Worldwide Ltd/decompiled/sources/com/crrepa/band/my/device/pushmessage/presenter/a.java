package com.crrepa.band.my.device.pushmessage.presenter;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.pushmessage.c;
import com.crrepa.band.my.model.MessageModel;
import com.crrepa.band.my.model.db.MessagePush;
import com.crrepa.band.my.model.db.proxy.BandMessageDaoProxy;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.c0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import q1.b;

/* loaded from: classes2.dex */
public class a implements f {
    private static final int DEFAULT_MESSAGE_TYPE = -1;
    private Activity context;
    private BandMessageDaoProxy messageDaoProxy = new BandMessageDaoProxy();
    private int messageType = -1;
    private c view;

    /* renamed from: com.crrepa.band.my.device.pushmessage.presenter.a$a, reason: collision with other inner class name */
    class C0186a implements Consumer {
        final /* synthetic */ boolean val$enable;
        final /* synthetic */ int val$type;

        C0186a(boolean z7, int i8) {
            this.val$enable = z7;
            this.val$type = i8;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            a.this.showMessageState(this.val$enable, this.val$type);
        }
    }

    @NonNull
    private MessageModel buildMessageModel(int i8, int i9, int i10, Boolean bool) {
        return new MessageModel(i8, i9, i10, getMessageEnable(bool));
    }

    private void checkCallPhonePermission() {
        boolean checkPermission = checkPermission("android.permission.CALL_PHONE");
        if (checkPermission) {
            return;
        }
        showMessageState(checkPermission, 0);
    }

    private boolean checkPermission(String str) {
        return c0.checkSelfPermission(this.context, str);
    }

    private void checkSmsPermission() {
        boolean checkPermission = checkPermission("android.permission.READ_SMS");
        if (checkPermission) {
            return;
        }
        showMessageState(checkPermission, 1);
    }

    private MessagePush getBandMessage() {
        MessagePush messagePush = this.messageDaoProxy.get();
        return messagePush == null ? new MessagePush() : messagePush;
    }

    private boolean getMessageEnable(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMessageState(boolean z7, int i8) {
        this.view.renderMessageState(i8, z7);
    }

    @SuppressLint({"CheckResult"})
    private void updateMessageState(int i8, boolean z7) {
        if (this.view == null || i8 == -1) {
            return;
        }
        Observable.just(0).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0186a(z7, i8));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getMessageList() {
        com.crrepa.band.my.ble.band.utils.a aVar = com.crrepa.band.my.ble.band.utils.a.getInstance();
        MessagePush bandMessage = getBandMessage();
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        if (aVar.hasPhone()) {
            arrayList.add(buildMessageModel(0, R$drawable.ic_message_phone, R.string.phone, Boolean.valueOf(getMessageEnable(bandMessage.getPhoneEnable()) && checkPermission("android.permission.READ_CALL_LOG"))));
        }
        if (aVar.hasSMS()) {
            if (getMessageEnable(bandMessage.getMessageEnable()) && checkPermission("android.permission.READ_SMS")) {
                z7 = true;
            }
            arrayList.add(buildMessageModel(1, R$drawable.ic_message_messages, R.string.message, Boolean.valueOf(z7)));
        }
        if (aVar.isChinese() && aVar.hasQQ()) {
            arrayList.add(buildMessageModel(3, R$drawable.ic_message_qq, R.string.qq, bandMessage.getQqEnable()));
        }
        arrayList.add(buildMessageModel(4, R$drawable.ic_message_facebook, R.string.facebook, bandMessage.getFacebookeEnable()));
        if (aVar.hasMessenger()) {
            arrayList.add(buildMessageModel(11, R$drawable.ic_message_messenger, R.string.messenger, bandMessage.getMessengerEnable()));
        }
        arrayList.add(buildMessageModel(5, R$drawable.ic_message_twitter, R.string.twitter, bandMessage.getTwitterEnable()));
        arrayList.add(buildMessageModel(6, R$drawable.ic_message_whatsapp, R.string.whatsapp, bandMessage.getWhatsappEnable()));
        arrayList.add(buildMessageModel(8, R$drawable.ic_message_skype, R.string.skype, bandMessage.getSkypeEnable()));
        arrayList.add(buildMessageModel(7, R$drawable.ic_message_instagram, R.string.instagram, bandMessage.getInstagramEnable()));
        if (aVar.hasMessage(13)) {
            arrayList.add(buildMessageModel(41, R$drawable.ic_message_zalo, R.string.zalo, bandMessage.getZaloEnable()));
        }
        if (aVar.hasTelegram()) {
            arrayList.add(buildMessageModel(13, R$drawable.ic_message_telegram, R.string.telegram, bandMessage.getTelegramEnable()));
        }
        if (aVar.hasLine()) {
            arrayList.add(buildMessageModel(10, R$drawable.ic_message_line, R.string.line, bandMessage.getLineEnable()));
        }
        if (aVar.hasKakao()) {
            arrayList.add(buildMessageModel(9, R$drawable.ic_message_kakaotalk, R.string.kakaotalk, bandMessage.getKakaotalkEnable()));
        }
        if (aVar.hasGmail()) {
            arrayList.add(buildMessageModel(12, R$drawable.ic_message_gmail, R.string.gmail, bandMessage.getGmailEnable()));
        }
        if (aVar.hasEmail()) {
            arrayList.add(buildMessageModel(42, R$drawable.ic_message_email, R.string.email, bandMessage.getEmailEnable()));
        }
        if (aVar.hasNateOn()) {
            arrayList.add(buildMessageModel(15, R$drawable.ic_message_nateon, R.string.nate_on, bandMessage.getNateOnEnable()));
        }
        if (aVar.hasViber()) {
            arrayList.add(buildMessageModel(14, R$drawable.ic_message_viber, R.string.viber, bandMessage.getViberEnable()));
        }
        if (aVar.hasMessage(36)) {
            arrayList.add(buildMessageModel(16, R$drawable.ic_message_flipkart, R.string.flipkart, bandMessage.getFlipkartEnable()));
        }
        if (aVar.hasMessage(18)) {
            arrayList.add(buildMessageModel(17, R$drawable.ic_message_calendar, R.string.calendar_google, bandMessage.getCalendarEnable()));
        }
        if (aVar.hasMessage(20)) {
            arrayList.add(buildMessageModel(18, R$drawable.ic_message_outlook, R.string.outlook, bandMessage.getOutlookEnable()));
        }
        if (aVar.hasMessage(19)) {
            arrayList.add(buildMessageModel(19, R$drawable.ic_message_dailyhunt, R.string.dailyhunt, bandMessage.getDailhuntEnable()));
        }
        if (aVar.hasMessage(23)) {
            arrayList.add(buildMessageModel(20, R$drawable.ic_message_phonepe, R.string.phonepe, bandMessage.getPhonepeEnable()));
        }
        if (aVar.hasMessage(22)) {
            arrayList.add(buildMessageModel(21, R$drawable.ic_message_inshorts, R.string.inshorts, bandMessage.getInshortsEnable()));
        }
        if (aVar.hasMessage(26)) {
            arrayList.add(buildMessageModel(22, R$drawable.ic_message_swiggy, R.string.swiggy, bandMessage.getSwiggyEnable()));
        }
        if (aVar.hasMessage(27)) {
            arrayList.add(buildMessageModel(23, R$drawable.ic_message_zomato, R.string.zomato, bandMessage.getZomatoEnable()));
        }
        if (aVar.hasMessage(29)) {
            arrayList.add(buildMessageModel(24, R$drawable.ic_message_ola, R.string.ola, bandMessage.getOlaEnable()));
        }
        if (aVar.hasMessage(28)) {
            arrayList.add(buildMessageModel(25, R$drawable.ic_message_uber, R.string.uber, bandMessage.getUberEnable()));
        }
        if (aVar.hasMessage(30)) {
            arrayList.add(buildMessageModel(26, R$drawable.ic_message_reflex, R.string.reflex, bandMessage.getReflexappEnable()));
        }
        if (aVar.hasMessage(31)) {
            arrayList.add(buildMessageModel(27, R$drawable.ic_message_snapchat, R.string.snapchat, bandMessage.getSnapchatEnable()));
        }
        if (aVar.hasMessage(33)) {
            arrayList.add(buildMessageModel(28, R$drawable.ic_message_youtube, R.string.youtube, bandMessage.getYoutubeEnable()));
        }
        if (aVar.hasMessage(34)) {
            arrayList.add(buildMessageModel(29, R$drawable.ic_message_linkedin, R.string.linkedin, bandMessage.getLinkedinEnable()));
        }
        if (aVar.hasMessage(25)) {
            arrayList.add(buildMessageModel(30, R$drawable.ic_message_paytm, R.string.paytm, bandMessage.getPaytmEnable()));
        }
        if (aVar.hasMessage(35)) {
            arrayList.add(buildMessageModel(31, R$drawable.ic_message_amazon, R.string.amazon, bandMessage.getAmazonEnable()));
        }
        if (aVar.hasMessage(37)) {
            arrayList.add(buildMessageModel(32, R$drawable.ic_message_netflix, R.string.netflix, bandMessage.getNetflixEnable()));
        }
        if (aVar.hasMessage(38)) {
            arrayList.add(buildMessageModel(43, R$drawable.ic_message_hotstar, R.string.hotstar, bandMessage.getHotstarEnable()));
        }
        if (aVar.hasMessage(24)) {
            arrayList.add(buildMessageModel(33, R$drawable.ic_message_gpay, R.string.gpay, bandMessage.getGpayEnable()));
        }
        if (aVar.hasMessage(21)) {
            arrayList.add(buildMessageModel(34, R$drawable.ic_message_yahoo, R.string.yahoo_mail, bandMessage.getYahooEnable()));
        }
        if (aVar.hasMessage(40)) {
            arrayList.add(buildMessageModel(35, R$drawable.ic_message_googlechat, R.string.google_chat, bandMessage.getGoogleChatEnable()));
        }
        if (aVar.hasMessage(39)) {
            arrayList.add(buildMessageModel(36, R$drawable.ic_message_amazonprime, R.string.amazon_prime, bandMessage.getAmazonPrimeEnable()));
        }
        if (aVar.hasMessage(32)) {
            arrayList.add(buildMessageModel(37, R$drawable.ic_message_ytmusic, R.string.yt_music, bandMessage.getYtmusicEnable()));
        }
        if (aVar.hasMessage(41)) {
            arrayList.add(buildMessageModel(44, R$drawable.ic_message_wynk, R.string.wynk, bandMessage.getWynkEnable()));
        }
        if (aVar.hasMessage(43)) {
            arrayList.add(buildMessageModel(38, R$drawable.ic_message_dunzo, R.string.dunzo, bandMessage.getDunzoEnable()));
        }
        if (aVar.hasMessage(42)) {
            arrayList.add(buildMessageModel(39, R$drawable.ic_message_googledrive, R.string.google_drive, bandMessage.getDriveEnable()));
        }
        if (aVar.hasMessage(44)) {
            arrayList.add(buildMessageModel(40, R$drawable.ic_message_gaana, R.string.gaana, bandMessage.getGaanaEnable()));
        }
        if (aVar.hasMessage(45)) {
            arrayList.add(buildMessageModel(46, R$drawable.ic_message_miss_call, R.string.miss_call, bandMessage.getMissCallEnable()));
        }
        if (aVar.hasMessage(46)) {
            arrayList.add(buildMessageModel(45, R$drawable.ic_message_whatsapp_business, R.string.whatsapp_business, bandMessage.getWhatsAppBusinessEnable()));
        }
        if (aVar.hasMessage(47)) {
            arrayList.add(buildMessageModel(47, R$drawable.ic_message_dingtalk, R.string.dingtalk, bandMessage.getDingtalkEnable()));
        }
        if (aVar.hasMessage(48)) {
            arrayList.add(buildMessageModel(48, R$drawable.ic_message_tiktok, R.string.tiktok, bandMessage.getTiktokEnable()));
        }
        if (aVar.hasMessage(49)) {
            arrayList.add(buildMessageModel(49, R$drawable.ic_message_lyft, R.string.lyft, bandMessage.getLyftEnable()));
        }
        if (aVar.hasMessage(51)) {
            arrayList.add(buildMessageModel(50, R$drawable.ic_message_googlemaps, R.string.google_maps, bandMessage.getGoogleMapsEnable()));
        }
        if (aVar.hasMessage(52)) {
            arrayList.add(buildMessageModel(51, R$drawable.ic_message_slack, R.string.slack, bandMessage.getSlackEnable()));
        }
        if (aVar.hasMessage(53)) {
            arrayList.add(buildMessageModel(52, R$drawable.ic_message_microsoftteams, R.string.microsoft_teams, bandMessage.getMicrosoftTeamsEnable()));
        }
        if (aVar.hasMessage(54)) {
            arrayList.add(buildMessageModel(53, R$drawable.ic_message_mormaiismartwatches, R.string.mormaii_smartwatches, bandMessage.getMormaiiSmartwatchesEnable()));
        }
        if (aVar.hasMessage(55)) {
            arrayList.add(buildMessageModel(55, R$drawable.ic_message_reddit, R.string.reddit, bandMessage.getRedditEnable()));
        }
        if (aVar.hasMessage(56)) {
            arrayList.add(buildMessageModel(56, R$drawable.ic_message_discord, R.string.discord, bandMessage.getDiscordEnable()));
        }
        if (aVar.hasMessage(57)) {
            arrayList.add(buildMessageModel(57, R$drawable.ic_message_calendar_default, R.string.calendar, bandMessage.getDefaultCalendarEnable()));
        }
        if (aVar.hasMessage(58)) {
            arrayList.add(buildMessageModel(58, R$drawable.ic_message_gojek, R.string.gojek, bandMessage.getGojekEnable()));
        }
        if (aVar.hasMessage(59)) {
            arrayList.add(buildMessageModel(59, R$drawable.ic_message_lark, R.string.lark, bandMessage.getLarkEnable()));
        }
        if (aVar.hasMessage(60)) {
            arrayList.add(buildMessageModel(60, R$drawable.ic_message_grab, R.string.garb, bandMessage.getGarbEnable()));
        }
        if (aVar.hasMessage(61)) {
            arrayList.add(buildMessageModel(61, R$drawable.ic_message_shopee, R.string.shopee, bandMessage.getShopeeEnable()));
        }
        if (aVar.hasMessage(62)) {
            arrayList.add(buildMessageModel(62, R$drawable.ic_message_tokopedia, R.string.tokopedia, bandMessage.getTokopediaEnable()));
        }
        if (aVar.hasMessage(63)) {
            arrayList.add(buildMessageModel(63, R$drawable.ic_message_threads, R.string.threads, bandMessage.getThreadsEnable()));
        }
        if (aVar.hasMessage(64)) {
            arrayList.add(buildMessageModel(64, R$drawable.ic_message_smartgoods, R.string.smartgoods, bandMessage.getSmartgoodsEnable()));
        }
        if (aVar.hasWechat()) {
            arrayList.add(buildMessageModel(2, R$drawable.ic_message_wechat, R.string.wechat, bandMessage.getWechatEnable()));
        }
        arrayList.add(buildMessageModel(128, R$drawable.ic_message_others, R.string.message_others, bandMessage.getOthersEnable()));
        this.view.renderMessageList(arrayList);
    }

    public void needsPermission(int i8) {
        this.messageType = i8;
        if (i8 == 0) {
            this.view.requestCallPermission();
        } else if (i8 != 1) {
            requestNotificationListener();
        } else {
            this.view.requestSMSPermission();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void rejectNotificationAccess() {
        updateMessageState(this.messageType, false);
    }

    public void requestNotificationListener() {
        if (b.isNotificationEnabled(this.context)) {
            return;
        }
        this.view.renderNotificationListenerDialog();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
        if (this.messageType == 0) {
            checkCallPhonePermission();
        }
        if (this.messageType == 1) {
            checkSmsPermission();
        }
        if (b.isNotificationEnabled(this.context)) {
            this.view.enableNotificationListenerService();
        } else {
            this.view.disableNotificationListenerService();
        }
    }

    public void saveMessageState(List<MessageModel> list) {
        MessagePush bandMessage = getBandMessage();
        for (MessageModel messageModel : list) {
            boolean isEnable = messageModel.isEnable();
            com.orhanobut.logger.f.d(messageModel.getType() + " : " + isEnable);
            int type = messageModel.getType();
            if (type != 128) {
                switch (type) {
                    case 0:
                        bandMessage.setPhoneEnable(Boolean.valueOf(isEnable));
                        break;
                    case 1:
                        bandMessage.setMessageEnable(Boolean.valueOf(isEnable));
                        break;
                    case 2:
                        bandMessage.setWechatEnable(Boolean.valueOf(isEnable));
                        break;
                    case 3:
                        bandMessage.setQqEnable(Boolean.valueOf(isEnable));
                        break;
                    case 4:
                        bandMessage.setFacebookeEnable(Boolean.valueOf(isEnable));
                        break;
                    case 5:
                        bandMessage.setTwitterEnable(Boolean.valueOf(isEnable));
                        break;
                    case 6:
                        bandMessage.setWhatsappEnable(Boolean.valueOf(isEnable));
                        break;
                    case 7:
                        bandMessage.setInstagramEnable(Boolean.valueOf(isEnable));
                        break;
                    case 8:
                        bandMessage.setSkypeEnable(Boolean.valueOf(isEnable));
                        break;
                    case 9:
                        bandMessage.setKakaotalkEnable(Boolean.valueOf(isEnable));
                        break;
                    case 10:
                        bandMessage.setLineEnable(Boolean.valueOf(isEnable));
                        break;
                    case 11:
                        bandMessage.setMessengerEnable(Boolean.valueOf(isEnable));
                        break;
                    case 12:
                        bandMessage.setGmailEnable(Boolean.valueOf(isEnable));
                        break;
                    case 13:
                        bandMessage.setTelegramEnable(Boolean.valueOf(isEnable));
                        break;
                    case 14:
                        bandMessage.setViberEnable(Boolean.valueOf(isEnable));
                        break;
                    case 15:
                        bandMessage.setNateOnEnable(Boolean.valueOf(isEnable));
                        break;
                    case 16:
                        bandMessage.setFlipkartEnable(Boolean.valueOf(isEnable));
                        break;
                    case 17:
                        bandMessage.setCalendarEnable(Boolean.valueOf(isEnable));
                        break;
                    case 18:
                        bandMessage.setOutlookEnable(Boolean.valueOf(isEnable));
                        break;
                    case 19:
                        bandMessage.setDailhuntEnable(Boolean.valueOf(isEnable));
                        break;
                    case 20:
                        bandMessage.setPhonepeEnable(Boolean.valueOf(isEnable));
                        break;
                    case 21:
                        bandMessage.setInshortsEnable(Boolean.valueOf(isEnable));
                        break;
                    case 22:
                        bandMessage.setSwiggyEnable(Boolean.valueOf(isEnable));
                        break;
                    case 23:
                        bandMessage.setZomatoEnable(Boolean.valueOf(isEnable));
                        break;
                    case 24:
                        bandMessage.setOlaEnable(Boolean.valueOf(isEnable));
                        break;
                    case 25:
                        bandMessage.setUberEnable(Boolean.valueOf(isEnable));
                        break;
                    case 26:
                        bandMessage.setReflexappEnable(Boolean.valueOf(isEnable));
                        break;
                    case 27:
                        bandMessage.setSnapchatEnable(Boolean.valueOf(isEnable));
                        break;
                    case 28:
                        bandMessage.setYoutubeEnable(Boolean.valueOf(isEnable));
                        break;
                    case 29:
                        bandMessage.setLinkedinEnable(Boolean.valueOf(isEnable));
                        break;
                    case 30:
                        bandMessage.setPaytmEnable(Boolean.valueOf(isEnable));
                        break;
                    case 31:
                        bandMessage.setAmazonEnable(Boolean.valueOf(isEnable));
                        break;
                    case 32:
                        bandMessage.setNetflixEnable(Boolean.valueOf(isEnable));
                        break;
                    case 33:
                        bandMessage.setGpayEnable(Boolean.valueOf(isEnable));
                        break;
                    case 34:
                        bandMessage.setYahooEnable(Boolean.valueOf(isEnable));
                        break;
                    case 35:
                        bandMessage.setGoogleChatEnable(Boolean.valueOf(isEnable));
                        break;
                    case 36:
                        bandMessage.setAmazonPrimeEnable(Boolean.valueOf(isEnable));
                        break;
                    case 37:
                        bandMessage.setYtmusicEnable(Boolean.valueOf(isEnable));
                        break;
                    case 38:
                        bandMessage.setDunzoEnable(Boolean.valueOf(isEnable));
                        break;
                    case 39:
                        bandMessage.setDriveEnable(Boolean.valueOf(isEnable));
                        break;
                    case 40:
                        bandMessage.setGaanaEnable(Boolean.valueOf(isEnable));
                        break;
                    case 41:
                        bandMessage.setZaloEnable(Boolean.valueOf(isEnable));
                        break;
                    case 42:
                        bandMessage.setEmailEnable(Boolean.valueOf(isEnable));
                        break;
                    case 43:
                        bandMessage.setHotstarEnable(Boolean.valueOf(isEnable));
                        break;
                    case 44:
                        bandMessage.setWynkEnable(Boolean.valueOf(isEnable));
                        break;
                    case 45:
                        bandMessage.setWhatsAppBusinessEnable(Boolean.valueOf(isEnable));
                        break;
                    case 46:
                        bandMessage.setMissCallEnable(Boolean.valueOf(isEnable));
                        break;
                    case 47:
                        bandMessage.setDingtalkEnable(Boolean.valueOf(isEnable));
                        break;
                    case 48:
                        bandMessage.setTiktokEnable(Boolean.valueOf(isEnable));
                        break;
                    case 49:
                        bandMessage.setLyftEnable(Boolean.valueOf(isEnable));
                        break;
                    case 50:
                        bandMessage.setGoogleMapsEnable(Boolean.valueOf(isEnable));
                        break;
                    case 51:
                        bandMessage.setSlackEnable(Boolean.valueOf(isEnable));
                        break;
                    case 52:
                        bandMessage.setMicrosoftTeamsEnable(Boolean.valueOf(isEnable));
                        break;
                    case 53:
                        bandMessage.setMormaiiSmartwatchesEnable(Boolean.valueOf(isEnable));
                        break;
                    default:
                        switch (type) {
                            case 55:
                                bandMessage.setRedditEnable(Boolean.valueOf(isEnable));
                                break;
                            case 56:
                                bandMessage.setDiscordEnable(Boolean.valueOf(isEnable));
                                break;
                            case 57:
                                bandMessage.setDefaultCalendarEnable(Boolean.valueOf(isEnable));
                                break;
                            case 58:
                                bandMessage.setGojekEnable(Boolean.valueOf(isEnable));
                                break;
                            case 59:
                                bandMessage.setLarkEnable(Boolean.valueOf(isEnable));
                                break;
                            case 60:
                                bandMessage.setGarbEnable(Boolean.valueOf(isEnable));
                                break;
                            case 61:
                                bandMessage.setShopeeEnable(Boolean.valueOf(isEnable));
                                break;
                            case 62:
                                bandMessage.setTokopediaEnable(Boolean.valueOf(isEnable));
                                break;
                            case 63:
                                bandMessage.setThreadsEnable(Boolean.valueOf(isEnable));
                                break;
                            case 64:
                                bandMessage.setSmartgoodsEnable(Boolean.valueOf(isEnable));
                                break;
                        }
                }
            } else {
                bandMessage.setOthersEnable(Boolean.valueOf(isEnable));
            }
        }
        this.messageDaoProxy.save(bandMessage);
        com.crrepa.band.my.device.pushmessage.notify.c.getInstance().updateMessagePush(bandMessage);
    }

    public void sendOtherMessageState(boolean z7) {
        i4.getInstance().sendOtherMessageState(z7);
    }

    public void setContext(Activity activity) {
        this.context = activity;
    }

    public void setView(c cVar) {
        this.view = cVar;
    }
}
