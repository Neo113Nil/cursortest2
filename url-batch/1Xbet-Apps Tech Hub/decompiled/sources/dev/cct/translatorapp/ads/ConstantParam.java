package dev.cct.translatorapp.ads;

import androidx.lifecycle.MutableLiveData;
import androidx.work.WorkRequest;
import dev.cct.translatorapp.TranslatorAdmobAds.AppOpen;
import dev.cct.translatorapp.TranslatorAdmobAds.BannerAdManagerWithActivity;
import dev.cct.translatorapp.TranslatorAdmobAds.CollapsibleBannerAdManager;
import dev.cct.translatorapp.TranslatorAdmobAds.InlineBannerAdManager;
import dev.cct.translatorapp.TranslatorAdmobAds.Interstitial;
import dev.cct.translatorapp.TranslatorAdmobAds.Native;
import dev.cct.translatorapp.TranslatorAdmobAds.NativeFullScreen;
import dev.cct.translatorapp.TranslatorAdmobAds.NativeLarge;
import dev.cct.translatorapp.TranslatorAdmobAds.NativeSmall;
import dev.cct.translatorapp.TranslatorAdmobAds.Rewarded;
import dev.cct.translatorapp.TranslatorAdmobAds.facebookads.FacebookBannerAdManager;
import dev.cct.translatorapp.TranslatorAdmobAds.facebookads.FacebookInterstitials;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConstantParam.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0007\u0010¼\u0001\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\bR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u001a\u0010C\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010(\"\u0004\bE\u0010*R\u001a\u0010F\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010(\"\u0004\bH\u0010*R\u001a\u0010I\u001a\u00020;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R\u001a\u0010L\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR\u001a\u0010O\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010(\"\u0004\bQ\u0010*R\u001a\u0010R\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010(\"\u0004\bT\u0010*R\u001a\u0010U\u001a\u00020VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010(\"\u0004\b]\u0010*R\u001a\u0010^\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0006\"\u0004\b`\u0010\bR\u001a\u0010a\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010(\"\u0004\bc\u0010*R\u001a\u0010d\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010(\"\u0004\bf\u0010*R\u001a\u0010g\u001a\u00020hX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010(\"\u0004\bo\u0010*R\u001a\u0010p\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0006\"\u0004\br\u0010\bR\u001a\u0010s\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010(\"\u0004\bu\u0010*R\u001a\u0010v\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010(\"\u0004\bx\u0010*R\u001a\u0010y\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010(\"\u0004\b{\u0010*R\u001a\u0010|\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0006\"\u0004\b~\u0010\bR\u001c\u0010\u007f\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010(\"\u0005\b\u0081\u0001\u0010*R\u001d\u0010\u0082\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010(\"\u0005\b\u0084\u0001\u0010*R\u001d\u0010\u0085\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010(\"\u0005\b\u0087\u0001\u0010*R \u0010\u0088\u0001\u001a\u00030\u0089\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001d\u0010\u008e\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010(\"\u0005\b\u0090\u0001\u0010*R \u0010\u0091\u0001\u001a\u00030\u0092\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001d\u0010\u0097\u0001\u001a\u00020;X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010=\"\u0005\b\u0099\u0001\u0010?R\u001d\u0010\u009a\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0006\"\u0005\b\u009b\u0001\u0010\bR\u001d\u0010\u009c\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010\u0006\"\u0005\b\u009d\u0001\u0010\bR\u001d\u0010\u009e\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u0006\"\u0005\b\u009f\u0001\u0010\bR\u001d\u0010 \u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010\u0006\"\u0005\b¡\u0001\u0010\bR\u001d\u0010¢\u0001\u001a\u00020;X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010=\"\u0005\b£\u0001\u0010?R\u001d\u0010¤\u0001\u001a\u00020;X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u0010=\"\u0005\b¥\u0001\u0010?R\u001d\u0010¦\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010\u0006\"\u0005\b§\u0001\u0010\bR\u001d\u0010¨\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010\u0006\"\u0005\b©\u0001\u0010\bR\u001d\u0010ª\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010\u0006\"\u0005\b«\u0001\u0010\bR\u001d\u0010¬\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010\u0006\"\u0005\b\u00ad\u0001\u0010\bR\u001d\u0010®\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010\u0006\"\u0005\b¯\u0001\u0010\bR\u001d\u0010°\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010\u0006\"\u0005\b±\u0001\u0010\bR\u001d\u0010²\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010\u0006\"\u0005\b³\u0001\u0010\bR\u001d\u0010´\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010\u0006\"\u0005\bµ\u0001\u0010\bR\u001d\u0010¶\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0001\u0010\u0006\"\u0005\b·\u0001\u0010\bR\u001d\u0010¸\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010\u0006\"\u0005\b¹\u0001\u0010\bR\u001d\u0010º\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010\u0006\"\u0005\b»\u0001\u0010\bR/\u0010¼\u0001\u001a\u0012\u0012\r\u0012\u000b ¾\u0001*\u0004\u0018\u00010\u00040\u00040½\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¼\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R\u001d\u0010Â\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0001\u0010\u0006\"\u0005\bÃ\u0001\u0010\bR\u001d\u0010Ä\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÄ\u0001\u0010\u0006\"\u0005\bÅ\u0001\u0010\bR\u001d\u0010Æ\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÆ\u0001\u0010\u0006\"\u0005\bÇ\u0001\u0010\bR\u001d\u0010È\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0001\u0010\u0006\"\u0005\bÉ\u0001\u0010\bR\u001d\u0010Ê\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u0010(\"\u0005\bÌ\u0001\u0010*R\u001d\u0010Í\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0001\u0010(\"\u0005\bÏ\u0001\u0010*R\u001d\u0010Ð\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÑ\u0001\u0010(\"\u0005\bÒ\u0001\u0010*R\u001d\u0010Ó\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0001\u0010(\"\u0005\bÕ\u0001\u0010*R \u0010Ö\u0001\u001a\u00030×\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R\u001d\u0010Ü\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÝ\u0001\u0010(\"\u0005\bÞ\u0001\u0010*R \u0010ß\u0001\u001a\u00030à\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R\u001d\u0010å\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bæ\u0001\u0010(\"\u0005\bç\u0001\u0010*R\u001d\u0010è\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bé\u0001\u0010(\"\u0005\bê\u0001\u0010*R\u001d\u0010ë\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bì\u0001\u0010(\"\u0005\bí\u0001\u0010*R\u001d\u0010î\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bï\u0001\u0010(\"\u0005\bð\u0001\u0010*R\u001d\u0010ñ\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bò\u0001\u0010(\"\u0005\bó\u0001\u0010*R \u0010ô\u0001\u001a\u00030õ\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bö\u0001\u0010÷\u0001\"\u0006\bø\u0001\u0010ù\u0001R\u001d\u0010ú\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bû\u0001\u0010(\"\u0005\bü\u0001\u0010*R\u001d\u0010ý\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bþ\u0001\u0010\u0006\"\u0005\bÿ\u0001\u0010\bR \u0010\u0080\u0002\u001a\u00030\u0081\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002\"\u0006\b\u0084\u0002\u0010\u0085\u0002R \u0010\u0086\u0002\u001a\u00030\u0087\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002\"\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001d\u0010\u008c\u0002\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0002\u0010(\"\u0005\b\u008e\u0002\u0010*R\u001d\u0010\u008f\u0002\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0002\u0010(\"\u0005\b\u0091\u0002\u0010*R\u001d\u0010\u0092\u0002\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0002\u0010(\"\u0005\b\u0094\u0002\u0010*R\u001d\u0010\u0095\u0002\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0002\u0010(\"\u0005\b\u0097\u0002\u0010*R\u001d\u0010\u0098\u0002\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0002\u0010(\"\u0005\b\u009a\u0002\u0010*R\u001d\u0010\u009b\u0002\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0002\u0010(\"\u0005\b\u009d\u0002\u0010*R\u001d\u0010\u009e\u0002\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0002\u0010(\"\u0005\b \u0002\u0010*R\u001d\u0010¡\u0002\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0002\u0010(\"\u0005\b£\u0002\u0010*¨\u0006¤\u0002"}, d2 = {"Ldev/cct/translatorapp/ads/ConstantParam;", "", "()V", "ADS_INITIALIZATION_COMPLETED", "", "getADS_INITIALIZATION_COMPLETED", "()Z", "setADS_INITIALIZATION_COMPLETED", "(Z)V", "FBTAG", "", "OTHER_AD_DISPLAYED", "getOTHER_AD_DISPLAYED", "setOTHER_AD_DISPLAYED", "SECONDS", "", "getSECONDS", "()J", "setSECONDS", "(J)V", "SPLASH_DELAY_TIME", "getSPLASH_DELAY_TIME", "setSPLASH_DELAY_TIME", "adoptiveBanner", "Ldev/cct/translatorapp/TranslatorAdmobAds/BannerAdManagerWithActivity;", "getAdoptiveBanner", "()Ldev/cct/translatorapp/TranslatorAdmobAds/BannerAdManagerWithActivity;", "setAdoptiveBanner", "(Ldev/cct/translatorapp/TranslatorAdmobAds/BannerAdManagerWithActivity;)V", "appIsForeground", "getAppIsForeground", "setAppIsForeground", "appOpen", "Ldev/cct/translatorapp/TranslatorAdmobAds/AppOpen;", "getAppOpen", "()Ldev/cct/translatorapp/TranslatorAdmobAds/AppOpen;", "setAppOpen", "(Ldev/cct/translatorapp/TranslatorAdmobAds/AppOpen;)V", "backInterstitialsAdId", "getBackInterstitialsAdId", "()Ljava/lang/String;", "setBackInterstitialsAdId", "(Ljava/lang/String;)V", "backVideoViewInterstitialsAdId", "getBackVideoViewInterstitialsAdId", "setBackVideoViewInterstitialsAdId", "bannerAd", "Ldev/cct/translatorapp/TranslatorAdmobAds/CollapsibleBannerAdManager;", "getBannerAd", "()Ldev/cct/translatorapp/TranslatorAdmobAds/CollapsibleBannerAdManager;", "setBannerAd", "(Ldev/cct/translatorapp/TranslatorAdmobAds/CollapsibleBannerAdManager;)V", "bannerCollapsibleAd", "Ldev/cct/translatorapp/TranslatorAdmobAds/CollapsibleBannerAd;", "getBannerCollapsibleAd", "()Ldev/cct/translatorapp/TranslatorAdmobAds/CollapsibleBannerAd;", "setBannerCollapsibleAd", "(Ldev/cct/translatorapp/TranslatorAdmobAds/CollapsibleBannerAd;)V", "clickCount", "", "getClickCount", "()I", "setClickCount", "(I)V", "clickCountMic", "getClickCountMic", "setClickCountMic", "collapsibleLangId", "getCollapsibleLangId", "setCollapsibleLangId", "collapsibleMainScreenId", "getCollapsibleMainScreenId", "setCollapsibleMainScreenId", "countStatusSaver", "getCountStatusSaver", "setCountStatusSaver", "deleteInterstitialParam", "getDeleteInterstitialParam", "setDeleteInterstitialParam", "dicCollapsibleInterstitialsAdId", "getDicCollapsibleInterstitialsAdId", "setDicCollapsibleInterstitialsAdId", "exitNativeId", "getExitNativeId", "setExitNativeId", "fbBannerAd", "Ldev/cct/translatorapp/TranslatorAdmobAds/facebookads/FacebookBannerAdManager;", "getFbBannerAd", "()Ldev/cct/translatorapp/TranslatorAdmobAds/facebookads/FacebookBannerAdManager;", "setFbBannerAd", "(Ldev/cct/translatorapp/TranslatorAdmobAds/facebookads/FacebookBannerAdManager;)V", "fbBannerAdId", "getFbBannerAdId", "setFbBannerAdId", "fbBannerEnableOrNot", "getFbBannerEnableOrNot", "setFbBannerEnableOrNot", "fbBannerId", "getFbBannerId", "setFbBannerId", "fbDirectInterstitialsAdId", "getFbDirectInterstitialsAdId", "setFbDirectInterstitialsAdId", "fbInterstitial", "Ldev/cct/translatorapp/TranslatorAdmobAds/facebookads/FacebookInterstitials;", "getFbInterstitial", "()Ldev/cct/translatorapp/TranslatorAdmobAds/facebookads/FacebookInterstitials;", "setFbInterstitial", "(Ldev/cct/translatorapp/TranslatorAdmobAds/facebookads/FacebookInterstitials;)V", "fbInterstitialAdId", "getFbInterstitialAdId", "setFbInterstitialAdId", "fbInterstitialEnableOrNot", "getFbInterstitialEnableOrNot", "setFbInterstitialEnableOrNot", "fbInterstitialsAdId", "getFbInterstitialsAdId", "setFbInterstitialsAdId", "fbMainInterstitialsAdId", "getFbMainInterstitialsAdId", "setFbMainInterstitialsAdId", "fbNativeAdId", "getFbNativeAdId", "setFbNativeAdId", "fbNativeEnableOrNot", "getFbNativeEnableOrNot", "setFbNativeEnableOrNot", "floatingFbNativeAdId", "getFloatingFbNativeAdId", "setFloatingFbNativeAdId", "homeBannerId", "getHomeBannerId", "setHomeBannerId", "homeCollapsibleInterstitialsAdId", "getHomeCollapsibleInterstitialsAdId", "setHomeCollapsibleInterstitialsAdId", "inlineBannerAdManager", "Ldev/cct/translatorapp/TranslatorAdmobAds/InlineBannerAdManager;", "getInlineBannerAdManager", "()Ldev/cct/translatorapp/TranslatorAdmobAds/InlineBannerAdManager;", "setInlineBannerAdManager", "(Ldev/cct/translatorapp/TranslatorAdmobAds/InlineBannerAdManager;)V", "inlineBannerId", "getInlineBannerId", "setInlineBannerId", "interstitial", "Ldev/cct/translatorapp/TranslatorAdmobAds/Interstitial;", "getInterstitial", "()Ldev/cct/translatorapp/TranslatorAdmobAds/Interstitial;", "setInterstitial", "(Ldev/cct/translatorapp/TranslatorAdmobAds/Interstitial;)V", "interstitialAdCount", "getInterstitialAdCount", "setInterstitialAdCount", "isAppLanguagesScreenAdChange", "setAppLanguagesScreenAdChange", "isAppOpenShowed", "setAppOpenShowed", "isBannerLoaded", "setBannerLoaded", "isClickMainItems", "setClickMainItems", "isControlFullScreeNative", "setControlFullScreeNative", "isControlOnboardingScreen", "setControlOnboardingScreen", "isEnableLanguageAdmobOrFbNativeAd", "setEnableLanguageAdmobOrFbNativeAd", "isEnableSplashAdmobOrFbInterAd", "setEnableSplashAdmobOrFbInterAd", "isEnableSplashAdmobOrFbNativeAd", "setEnableSplashAdmobOrFbNativeAd", "isFailInterstitialAd", "setFailInterstitialAd", "isInterstitialOnOrOff", "setInterstitialOnOrOff", "isInterstitialShowed", "setInterstitialShowed", "isLastAdWasAdmob", "setLastAdWasAdmob", "isLoadedAdInters", "setLoadedAdInters", "isLoadedFbInterstitialsAd", "setLoadedFbInterstitialsAd", "isMainScreenAdStatus", "setMainScreenAdStatus", "isONorOffFacebookInters", "setONorOffFacebookInters", "isPurchased", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "setPurchased", "(Landroidx/lifecycle/MutableLiveData;)V", "isShowAppLanguagesNative", "setShowAppLanguagesNative", "isShowFbOnboarding", "setShowFbOnboarding", "isShowResumeAd", "setShowResumeAd", "isSplashAppOpenShow", "setSplashAppOpenShow", "languageAdmobNativeAdId", "getLanguageAdmobNativeAdId", "setLanguageAdmobNativeAdId", "languageBannerId", "getLanguageBannerId", "setLanguageBannerId", "languageFbNativeAdId", "getLanguageFbNativeAdId", "setLanguageFbNativeAdId", "languageScreenNativeId", "getLanguageScreenNativeId", "setLanguageScreenNativeId", "largeNative", "Ldev/cct/translatorapp/TranslatorAdmobAds/NativeLarge;", "getLargeNative", "()Ldev/cct/translatorapp/TranslatorAdmobAds/NativeLarge;", "setLargeNative", "(Ldev/cct/translatorapp/TranslatorAdmobAds/NativeLarge;)V", "mainAdmobNativeAdId", "getMainAdmobNativeAdId", "setMainAdmobNativeAdId", "native", "Ldev/cct/translatorapp/TranslatorAdmobAds/Native;", "getNative", "()Ldev/cct/translatorapp/TranslatorAdmobAds/Native;", "setNative", "(Ldev/cct/translatorapp/TranslatorAdmobAds/Native;)V", "onBoardingFullScreenNativeId", "getOnBoardingFullScreenNativeId", "setOnBoardingFullScreenNativeId", "onResumeAppOpenId", "getOnResumeAppOpenId", "setOnResumeAppOpenId", "onboardingNativeAdId", "getOnboardingNativeAdId", "setOnboardingNativeAdId", "phraseCollapsibleInterstitialsAdId", "getPhraseCollapsibleInterstitialsAdId", "setPhraseCollapsibleInterstitialsAdId", "phrasesPangleNativeAdId", "getPhrasesPangleNativeAdId", "setPhrasesPangleNativeAdId", "rewarded", "Ldev/cct/translatorapp/TranslatorAdmobAds/Rewarded;", "getRewarded", "()Ldev/cct/translatorapp/TranslatorAdmobAds/Rewarded;", "setRewarded", "(Ldev/cct/translatorapp/TranslatorAdmobAds/Rewarded;)V", "rewardedInterstitials", "getRewardedInterstitials", "setRewardedInterstitials", "showAllFragments", "getShowAllFragments", "setShowAllFragments", "showFullNative", "Ldev/cct/translatorapp/TranslatorAdmobAds/NativeFullScreen;", "getShowFullNative", "()Ldev/cct/translatorapp/TranslatorAdmobAds/NativeFullScreen;", "setShowFullNative", "(Ldev/cct/translatorapp/TranslatorAdmobAds/NativeFullScreen;)V", "smallNative", "Ldev/cct/translatorapp/TranslatorAdmobAds/NativeSmall;", "getSmallNative", "()Ldev/cct/translatorapp/TranslatorAdmobAds/NativeSmall;", "setSmallNative", "(Ldev/cct/translatorapp/TranslatorAdmobAds/NativeSmall;)V", "splashAdmobInterstitialId", "getSplashAdmobInterstitialId", "setSplashAdmobInterstitialId", "splashAdmobNativeAdId", "getSplashAdmobNativeAdId", "setSplashAdmobNativeAdId", "splashAppOpenId", "getSplashAppOpenId", "setSplashAppOpenId", "splashFbInterstitialId", "getSplashFbInterstitialId", "setSplashFbInterstitialId", "splashFbNativeAdId", "getSplashFbNativeAdId", "setSplashFbNativeAdId", "textCollapsibleInterstitialsAdId", "getTextCollapsibleInterstitialsAdId", "setTextCollapsibleInterstitialsAdId", "textInterstitialsAdmobId", "getTextInterstitialsAdmobId", "setTextInterstitialsAdmobId", "textPangleNativeAdId", "getTextPangleNativeAdId", "setTextPangleNativeAdId", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstantParam {
    private static boolean ADS_INITIALIZATION_COMPLETED = false;
    public static final String FBTAG = "facebookNativeAd";
    private static boolean OTHER_AD_DISPLAYED;
    private static long SECONDS;
    private static int clickCount;
    private static int clickCountMic;
    private static int countStatusSaver;
    private static boolean deleteInterstitialParam;
    private static int interstitialAdCount;
    private static boolean isAppOpenShowed;
    private static boolean isBannerLoaded;
    private static boolean isClickMainItems;
    private static int isControlFullScreeNative;
    private static int isControlOnboardingScreen;
    private static boolean isFailInterstitialAd;
    private static boolean isInterstitialShowed;
    private static boolean isLoadedAdInters;
    private static boolean isLoadedFbInterstitialsAd;
    public static final ConstantParam INSTANCE = new ConstantParam();
    private static MutableLiveData<Boolean> isPurchased = new MutableLiveData<>(false);
    private static String splashFbInterstitialId = "";
    private static String splashAdmobInterstitialId = "";
    private static String splashFbNativeAdId = "";
    private static String splashAdmobNativeAdId = "";
    private static boolean isEnableSplashAdmobOrFbInterAd = true;
    private static boolean isEnableSplashAdmobOrFbNativeAd = true;
    private static String languageFbNativeAdId = "";
    private static String languageAdmobNativeAdId = "";
    private static boolean isEnableLanguageAdmobOrFbNativeAd = true;
    private static String mainAdmobNativeAdId = "";
    private static String textPangleNativeAdId = "";
    private static String phrasesPangleNativeAdId = "";
    private static String floatingFbNativeAdId = "";
    private static String fbBannerId = "";
    private static String fbNativeAdId = "";
    private static String fbInterstitialAdId = "";
    private static String rewardedInterstitials = "";
    private static boolean fbBannerEnableOrNot = true;
    private static boolean fbNativeEnableOrNot = true;
    private static boolean fbInterstitialEnableOrNot = true;
    private static String textInterstitialsAdmobId = "";
    private static String splashAppOpenId = "";
    private static String onResumeAppOpenId = "";
    private static String textCollapsibleInterstitialsAdId = "";
    private static String phraseCollapsibleInterstitialsAdId = "";
    private static String homeCollapsibleInterstitialsAdId = "";
    private static String dicCollapsibleInterstitialsAdId = "";
    private static String onboardingNativeAdId = "";
    private static String onBoardingFullScreenNativeId = "";
    private static boolean isAppLanguagesScreenAdChange = true;
    private static boolean isMainScreenAdStatus = true;
    private static boolean isShowFbOnboarding = true;
    private static String languageBannerId = "";
    private static String homeBannerId = "";
    private static String inlineBannerId = "";
    private static String languageScreenNativeId = "";
    private static String collapsibleLangId = "";
    private static String collapsibleMainScreenId = "";
    private static String exitNativeId = "";
    private static String fbInterstitialsAdId = "";
    private static String fbDirectInterstitialsAdId = "";
    private static String fbMainInterstitialsAdId = "";
    private static String backInterstitialsAdId = "";
    private static String backVideoViewInterstitialsAdId = "";
    private static String fbBannerAdId = "";
    private static boolean isShowResumeAd = true;
    private static boolean isONorOffFacebookInters = true;
    private static long SPLASH_DELAY_TIME = WorkRequest.MIN_BACKOFF_MILLIS;
    private static FacebookInterstitials fbInterstitial = new FacebookInterstitials();
    private static Interstitial interstitial = new Interstitial();
    private static AppOpen appOpen = new AppOpen();
    private static Native native = new Native();
    private static NativeSmall smallNative = new NativeSmall();
    private static NativeLarge largeNative = new NativeLarge();
    private static InlineBannerAdManager inlineBannerAdManager = new InlineBannerAdManager();
    private static CollapsibleBannerAdManager bannerAd = new CollapsibleBannerAdManager();
    private static FacebookBannerAdManager fbBannerAd = new FacebookBannerAdManager();
    private static BannerAdManagerWithActivity adoptiveBanner = new BannerAdManagerWithActivity();
    private static NativeFullScreen showFullNative = new NativeFullScreen();
    private static dev.cct.translatorapp.TranslatorAdmobAds.CollapsibleBannerAd bannerCollapsibleAd = new dev.cct.translatorapp.TranslatorAdmobAds.CollapsibleBannerAd();
    private static Rewarded rewarded = new Rewarded();
    private static boolean isInterstitialOnOrOff = true;
    private static boolean isLastAdWasAdmob = true;
    private static boolean appIsForeground = true;
    private static boolean isSplashAppOpenShow = true;
    private static boolean isShowAppLanguagesNative = true;
    private static boolean showAllFragments = true;

    private ConstantParam() {
    }

    public final MutableLiveData<Boolean> isPurchased() {
        return isPurchased;
    }

    public final void setPurchased(MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        isPurchased = mutableLiveData;
    }

    /* renamed from: isPurchased, reason: collision with other method in class */
    public final boolean m204isPurchased() {
        Boolean value = isPurchased.getValue();
        if (value == null) {
            value = false;
        }
        return value.booleanValue();
    }

    public final String getSplashFbInterstitialId() {
        return splashFbInterstitialId;
    }

    public final void setSplashFbInterstitialId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        splashFbInterstitialId = str;
    }

    public final String getSplashAdmobInterstitialId() {
        return splashAdmobInterstitialId;
    }

    public final void setSplashAdmobInterstitialId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        splashAdmobInterstitialId = str;
    }

    public final String getSplashFbNativeAdId() {
        return splashFbNativeAdId;
    }

    public final void setSplashFbNativeAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        splashFbNativeAdId = str;
    }

    public final String getSplashAdmobNativeAdId() {
        return splashAdmobNativeAdId;
    }

    public final void setSplashAdmobNativeAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        splashAdmobNativeAdId = str;
    }

    public final boolean isEnableSplashAdmobOrFbInterAd() {
        return isEnableSplashAdmobOrFbInterAd;
    }

    public final void setEnableSplashAdmobOrFbInterAd(boolean z) {
        isEnableSplashAdmobOrFbInterAd = z;
    }

    public final boolean isEnableSplashAdmobOrFbNativeAd() {
        return isEnableSplashAdmobOrFbNativeAd;
    }

    public final void setEnableSplashAdmobOrFbNativeAd(boolean z) {
        isEnableSplashAdmobOrFbNativeAd = z;
    }

    public final String getLanguageFbNativeAdId() {
        return languageFbNativeAdId;
    }

    public final void setLanguageFbNativeAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        languageFbNativeAdId = str;
    }

    public final String getLanguageAdmobNativeAdId() {
        return languageAdmobNativeAdId;
    }

    public final void setLanguageAdmobNativeAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        languageAdmobNativeAdId = str;
    }

    public final boolean isEnableLanguageAdmobOrFbNativeAd() {
        return isEnableLanguageAdmobOrFbNativeAd;
    }

    public final void setEnableLanguageAdmobOrFbNativeAd(boolean z) {
        isEnableLanguageAdmobOrFbNativeAd = z;
    }

    public final String getMainAdmobNativeAdId() {
        return mainAdmobNativeAdId;
    }

    public final void setMainAdmobNativeAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        mainAdmobNativeAdId = str;
    }

    public final String getTextPangleNativeAdId() {
        return textPangleNativeAdId;
    }

    public final void setTextPangleNativeAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        textPangleNativeAdId = str;
    }

    public final String getPhrasesPangleNativeAdId() {
        return phrasesPangleNativeAdId;
    }

    public final void setPhrasesPangleNativeAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        phrasesPangleNativeAdId = str;
    }

    public final String getFloatingFbNativeAdId() {
        return floatingFbNativeAdId;
    }

    public final void setFloatingFbNativeAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        floatingFbNativeAdId = str;
    }

    public final String getFbBannerId() {
        return fbBannerId;
    }

    public final void setFbBannerId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        fbBannerId = str;
    }

    public final String getFbNativeAdId() {
        return fbNativeAdId;
    }

    public final void setFbNativeAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        fbNativeAdId = str;
    }

    public final String getFbInterstitialAdId() {
        return fbInterstitialAdId;
    }

    public final void setFbInterstitialAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        fbInterstitialAdId = str;
    }

    public final String getRewardedInterstitials() {
        return rewardedInterstitials;
    }

    public final void setRewardedInterstitials(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        rewardedInterstitials = str;
    }

    public final boolean getFbBannerEnableOrNot() {
        return fbBannerEnableOrNot;
    }

    public final void setFbBannerEnableOrNot(boolean z) {
        fbBannerEnableOrNot = z;
    }

    public final boolean getFbNativeEnableOrNot() {
        return fbNativeEnableOrNot;
    }

    public final void setFbNativeEnableOrNot(boolean z) {
        fbNativeEnableOrNot = z;
    }

    public final boolean getFbInterstitialEnableOrNot() {
        return fbInterstitialEnableOrNot;
    }

    public final void setFbInterstitialEnableOrNot(boolean z) {
        fbInterstitialEnableOrNot = z;
    }

    public final boolean isBannerLoaded() {
        return isBannerLoaded;
    }

    public final void setBannerLoaded(boolean z) {
        isBannerLoaded = z;
    }

    public final String getTextInterstitialsAdmobId() {
        return textInterstitialsAdmobId;
    }

    public final void setTextInterstitialsAdmobId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        textInterstitialsAdmobId = str;
    }

    public final String getSplashAppOpenId() {
        return splashAppOpenId;
    }

    public final void setSplashAppOpenId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        splashAppOpenId = str;
    }

    public final String getOnResumeAppOpenId() {
        return onResumeAppOpenId;
    }

    public final void setOnResumeAppOpenId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        onResumeAppOpenId = str;
    }

    public final String getTextCollapsibleInterstitialsAdId() {
        return textCollapsibleInterstitialsAdId;
    }

    public final void setTextCollapsibleInterstitialsAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        textCollapsibleInterstitialsAdId = str;
    }

    public final String getPhraseCollapsibleInterstitialsAdId() {
        return phraseCollapsibleInterstitialsAdId;
    }

    public final void setPhraseCollapsibleInterstitialsAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        phraseCollapsibleInterstitialsAdId = str;
    }

    public final String getHomeCollapsibleInterstitialsAdId() {
        return homeCollapsibleInterstitialsAdId;
    }

    public final void setHomeCollapsibleInterstitialsAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        homeCollapsibleInterstitialsAdId = str;
    }

    public final String getDicCollapsibleInterstitialsAdId() {
        return dicCollapsibleInterstitialsAdId;
    }

    public final void setDicCollapsibleInterstitialsAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        dicCollapsibleInterstitialsAdId = str;
    }

    public final String getOnboardingNativeAdId() {
        return onboardingNativeAdId;
    }

    public final void setOnboardingNativeAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        onboardingNativeAdId = str;
    }

    public final String getOnBoardingFullScreenNativeId() {
        return onBoardingFullScreenNativeId;
    }

    public final void setOnBoardingFullScreenNativeId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        onBoardingFullScreenNativeId = str;
    }

    public final int isControlOnboardingScreen() {
        return isControlOnboardingScreen;
    }

    public final void setControlOnboardingScreen(int i) {
        isControlOnboardingScreen = i;
    }

    public final int isControlFullScreeNative() {
        return isControlFullScreeNative;
    }

    public final void setControlFullScreeNative(int i) {
        isControlFullScreeNative = i;
    }

    public final boolean isAppLanguagesScreenAdChange() {
        return isAppLanguagesScreenAdChange;
    }

    public final void setAppLanguagesScreenAdChange(boolean z) {
        isAppLanguagesScreenAdChange = z;
    }

    public final boolean isMainScreenAdStatus() {
        return isMainScreenAdStatus;
    }

    public final void setMainScreenAdStatus(boolean z) {
        isMainScreenAdStatus = z;
    }

    public final boolean isShowFbOnboarding() {
        return isShowFbOnboarding;
    }

    public final void setShowFbOnboarding(boolean z) {
        isShowFbOnboarding = z;
    }

    public final String getLanguageBannerId() {
        return languageBannerId;
    }

    public final void setLanguageBannerId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        languageBannerId = str;
    }

    public final String getHomeBannerId() {
        return homeBannerId;
    }

    public final void setHomeBannerId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        homeBannerId = str;
    }

    public final String getInlineBannerId() {
        return inlineBannerId;
    }

    public final void setInlineBannerId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        inlineBannerId = str;
    }

    public final String getLanguageScreenNativeId() {
        return languageScreenNativeId;
    }

    public final void setLanguageScreenNativeId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        languageScreenNativeId = str;
    }

    public final String getCollapsibleLangId() {
        return collapsibleLangId;
    }

    public final void setCollapsibleLangId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        collapsibleLangId = str;
    }

    public final String getCollapsibleMainScreenId() {
        return collapsibleMainScreenId;
    }

    public final void setCollapsibleMainScreenId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        collapsibleMainScreenId = str;
    }

    public final String getExitNativeId() {
        return exitNativeId;
    }

    public final void setExitNativeId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        exitNativeId = str;
    }

    public final boolean getDeleteInterstitialParam() {
        return deleteInterstitialParam;
    }

    public final void setDeleteInterstitialParam(boolean z) {
        deleteInterstitialParam = z;
    }

    public final String getFbInterstitialsAdId() {
        return fbInterstitialsAdId;
    }

    public final void setFbInterstitialsAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        fbInterstitialsAdId = str;
    }

    public final String getFbDirectInterstitialsAdId() {
        return fbDirectInterstitialsAdId;
    }

    public final void setFbDirectInterstitialsAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        fbDirectInterstitialsAdId = str;
    }

    public final String getFbMainInterstitialsAdId() {
        return fbMainInterstitialsAdId;
    }

    public final void setFbMainInterstitialsAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        fbMainInterstitialsAdId = str;
    }

    public final String getBackInterstitialsAdId() {
        return backInterstitialsAdId;
    }

    public final void setBackInterstitialsAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        backInterstitialsAdId = str;
    }

    public final String getBackVideoViewInterstitialsAdId() {
        return backVideoViewInterstitialsAdId;
    }

    public final void setBackVideoViewInterstitialsAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        backVideoViewInterstitialsAdId = str;
    }

    public final String getFbBannerAdId() {
        return fbBannerAdId;
    }

    public final void setFbBannerAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        fbBannerAdId = str;
    }

    public final int getCountStatusSaver() {
        return countStatusSaver;
    }

    public final void setCountStatusSaver(int i) {
        countStatusSaver = i;
    }

    public final boolean isShowResumeAd() {
        return isShowResumeAd;
    }

    public final void setShowResumeAd(boolean z) {
        isShowResumeAd = z;
    }

    public final boolean isONorOffFacebookInters() {
        return isONorOffFacebookInters;
    }

    public final void setONorOffFacebookInters(boolean z) {
        isONorOffFacebookInters = z;
    }

    public final long getSPLASH_DELAY_TIME() {
        return SPLASH_DELAY_TIME;
    }

    public final void setSPLASH_DELAY_TIME(long j) {
        SPLASH_DELAY_TIME = j;
    }

    public final long getSECONDS() {
        return SECONDS;
    }

    public final void setSECONDS(long j) {
        SECONDS = j;
    }

    public final FacebookInterstitials getFbInterstitial() {
        return fbInterstitial;
    }

    public final void setFbInterstitial(FacebookInterstitials facebookInterstitials) {
        Intrinsics.checkNotNullParameter(facebookInterstitials, "<set-?>");
        fbInterstitial = facebookInterstitials;
    }

    public final Interstitial getInterstitial() {
        return interstitial;
    }

    public final void setInterstitial(Interstitial interstitial2) {
        Intrinsics.checkNotNullParameter(interstitial2, "<set-?>");
        interstitial = interstitial2;
    }

    public final AppOpen getAppOpen() {
        return appOpen;
    }

    public final void setAppOpen(AppOpen appOpen2) {
        Intrinsics.checkNotNullParameter(appOpen2, "<set-?>");
        appOpen = appOpen2;
    }

    public final Native getNative() {
        return native;
    }

    public final void setNative(Native r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        native = r2;
    }

    public final NativeSmall getSmallNative() {
        return smallNative;
    }

    public final void setSmallNative(NativeSmall nativeSmall) {
        Intrinsics.checkNotNullParameter(nativeSmall, "<set-?>");
        smallNative = nativeSmall;
    }

    public final NativeLarge getLargeNative() {
        return largeNative;
    }

    public final void setLargeNative(NativeLarge nativeLarge) {
        Intrinsics.checkNotNullParameter(nativeLarge, "<set-?>");
        largeNative = nativeLarge;
    }

    public final InlineBannerAdManager getInlineBannerAdManager() {
        return inlineBannerAdManager;
    }

    public final void setInlineBannerAdManager(InlineBannerAdManager inlineBannerAdManager2) {
        Intrinsics.checkNotNullParameter(inlineBannerAdManager2, "<set-?>");
        inlineBannerAdManager = inlineBannerAdManager2;
    }

    public final CollapsibleBannerAdManager getBannerAd() {
        return bannerAd;
    }

    public final void setBannerAd(CollapsibleBannerAdManager collapsibleBannerAdManager) {
        Intrinsics.checkNotNullParameter(collapsibleBannerAdManager, "<set-?>");
        bannerAd = collapsibleBannerAdManager;
    }

    public final FacebookBannerAdManager getFbBannerAd() {
        return fbBannerAd;
    }

    public final void setFbBannerAd(FacebookBannerAdManager facebookBannerAdManager) {
        Intrinsics.checkNotNullParameter(facebookBannerAdManager, "<set-?>");
        fbBannerAd = facebookBannerAdManager;
    }

    public final BannerAdManagerWithActivity getAdoptiveBanner() {
        return adoptiveBanner;
    }

    public final void setAdoptiveBanner(BannerAdManagerWithActivity bannerAdManagerWithActivity) {
        Intrinsics.checkNotNullParameter(bannerAdManagerWithActivity, "<set-?>");
        adoptiveBanner = bannerAdManagerWithActivity;
    }

    public final NativeFullScreen getShowFullNative() {
        return showFullNative;
    }

    public final void setShowFullNative(NativeFullScreen nativeFullScreen) {
        Intrinsics.checkNotNullParameter(nativeFullScreen, "<set-?>");
        showFullNative = nativeFullScreen;
    }

    public final dev.cct.translatorapp.TranslatorAdmobAds.CollapsibleBannerAd getBannerCollapsibleAd() {
        return bannerCollapsibleAd;
    }

    public final void setBannerCollapsibleAd(dev.cct.translatorapp.TranslatorAdmobAds.CollapsibleBannerAd collapsibleBannerAd) {
        Intrinsics.checkNotNullParameter(collapsibleBannerAd, "<set-?>");
        bannerCollapsibleAd = collapsibleBannerAd;
    }

    public final Rewarded getRewarded() {
        return rewarded;
    }

    public final void setRewarded(Rewarded rewarded2) {
        Intrinsics.checkNotNullParameter(rewarded2, "<set-?>");
        rewarded = rewarded2;
    }

    public final boolean isInterstitialOnOrOff() {
        return isInterstitialOnOrOff;
    }

    public final void setInterstitialOnOrOff(boolean z) {
        isInterstitialOnOrOff = z;
    }

    public final boolean isInterstitialShowed() {
        return isInterstitialShowed;
    }

    public final void setInterstitialShowed(boolean z) {
        isInterstitialShowed = z;
    }

    public final boolean isAppOpenShowed() {
        return isAppOpenShowed;
    }

    public final void setAppOpenShowed(boolean z) {
        isAppOpenShowed = z;
    }

    public final int getClickCount() {
        return clickCount;
    }

    public final void setClickCount(int i) {
        clickCount = i;
    }

    public final int getClickCountMic() {
        return clickCountMic;
    }

    public final void setClickCountMic(int i) {
        clickCountMic = i;
    }

    public final int getInterstitialAdCount() {
        return interstitialAdCount;
    }

    public final void setInterstitialAdCount(int i) {
        interstitialAdCount = i;
    }

    public final boolean getOTHER_AD_DISPLAYED() {
        return OTHER_AD_DISPLAYED;
    }

    public final void setOTHER_AD_DISPLAYED(boolean z) {
        OTHER_AD_DISPLAYED = z;
    }

    public final boolean isLastAdWasAdmob() {
        return isLastAdWasAdmob;
    }

    public final void setLastAdWasAdmob(boolean z) {
        isLastAdWasAdmob = z;
    }

    public final boolean getADS_INITIALIZATION_COMPLETED() {
        return ADS_INITIALIZATION_COMPLETED;
    }

    public final void setADS_INITIALIZATION_COMPLETED(boolean z) {
        ADS_INITIALIZATION_COMPLETED = z;
    }

    public final boolean getAppIsForeground() {
        return appIsForeground;
    }

    public final void setAppIsForeground(boolean z) {
        appIsForeground = z;
    }

    public final boolean isFailInterstitialAd() {
        return isFailInterstitialAd;
    }

    public final void setFailInterstitialAd(boolean z) {
        isFailInterstitialAd = z;
    }

    public final boolean isLoadedFbInterstitialsAd() {
        return isLoadedFbInterstitialsAd;
    }

    public final void setLoadedFbInterstitialsAd(boolean z) {
        isLoadedFbInterstitialsAd = z;
    }

    public final boolean isLoadedAdInters() {
        return isLoadedAdInters;
    }

    public final void setLoadedAdInters(boolean z) {
        isLoadedAdInters = z;
    }

    public final boolean isClickMainItems() {
        return isClickMainItems;
    }

    public final void setClickMainItems(boolean z) {
        isClickMainItems = z;
    }

    public final boolean isSplashAppOpenShow() {
        return isSplashAppOpenShow;
    }

    public final void setSplashAppOpenShow(boolean z) {
        isSplashAppOpenShow = z;
    }

    public final boolean isShowAppLanguagesNative() {
        return isShowAppLanguagesNative;
    }

    public final void setShowAppLanguagesNative(boolean z) {
        isShowAppLanguagesNative = z;
    }

    public final boolean getShowAllFragments() {
        return showAllFragments;
    }

    public final void setShowAllFragments(boolean z) {
        showAllFragments = z;
    }
}
