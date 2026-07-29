package com.aiming.mdt.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.aiming.mdt.a.ʽʾʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0151 extends BroadcastReceiver {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static long f505 = 1805038200141672513L;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f506 = 1;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f507;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ C0179 f508;

    C0151(C0179 c0179) {
        this.f508 = c0179;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m590(String str) {
        int i = f506 + 5;
        f507 = i % 128;
        int i2 = i % 2;
        char[] charArray = str.toCharArray();
        char c2 = charArray[0];
        int i3 = 1;
        char[] cArr = new char[charArray.length - 1];
        while (i3 < charArray.length) {
            int i4 = f507 + 77;
            f506 = i4 % 128;
            if ((i4 % 2 == 0 ? 'D' : '\'') != '\'') {
                cArr[i3] = (char) ((charArray[i3] ^ (i3 * c2)) - f505);
                i3 += 95;
            } else {
                cArr[i3 - 1] = (char) ((charArray[i3] ^ (i3 * c2)) ^ f505);
                i3++;
            }
            int i5 = f507 + 75;
            f506 = i5 % 128;
            int i6 = i5 % 2;
        }
        String str2 = new String(cArr);
        int i7 = f506 + 83;
        f507 = i7 % 128;
        if (i7 % 2 != 0) {
        }
        return str2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = f506 + 101;
        f507 = i % 128;
        int i2 = i % 2;
        context.unregisterReceiver(this);
        C0179.m681(this.f508).put(m590("듷쓴\u19ce滐ꏩ\uf8f7䷹苹\ud7aaⲚ憆뚨\u0ba0䂹").intern(), Integer.valueOf(intent.getIntExtra(m590("ꪍ\udabf┯辇\uda01⓵轼").intern(), -1)));
        C0179.m681(this.f508).put(m590("य礬找殸咉巏䜩ぱ㥩⊊⯢ᔣḒ݇\uf0b7").intern(), Integer.valueOf(intent.getIntExtra(m590("\ueed5黤궇뱋쭲\uda0f\ue8da\uf7f6").intern(), -1)));
        C0179.m681(this.f508).put(m590("냻샸ᇖ拄동Ӄ嗑ꛥ\uf7d5䣷駹\ueaed㯩").intern(), Integer.valueOf(intent.getIntExtra(m590("寉⯤잶捬ἀ뫀").intern(), -1)));
        C0179.m681(this.f508).put(m590("\ufde5跦诪覚螡蕝荭腻鼺鴯髒飺隘").intern(), Integer.valueOf(intent.getIntExtra(m590("\uf551蕣骀꿓ꕩ몱").intern(), -1)));
        int i3 = f507 + 75;
        f506 = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }
}
