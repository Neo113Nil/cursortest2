package com.aiming.mdt.a;

import java.util.List;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʻʽʾʿˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0067 {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private Map<String, List<C0068>> f150;

    /* renamed from: com.aiming.mdt.a.ʻʽʾʿˈˉ$ʻ, reason: contains not printable characters */
    public static class C0068 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f151;

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private String f152;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private String f153;

        /* renamed from: ʼ, reason: contains not printable characters */
        private String f154;

        /* renamed from: ʼʾ, reason: contains not printable characters */
        private long f155;

        /* renamed from: ʽ, reason: contains not printable characters */
        private String f156;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Imp{mPlacementId='");
            sb.append(this.f153);
            sb.append('\'');
            sb.append(", mCampaignId='");
            sb.append(this.f154);
            sb.append('\'');
            sb.append(", mTime='");
            sb.append(this.f156);
            sb.append('\'');
            sb.append(", mPkgName='");
            sb.append(this.f152);
            sb.append('\'');
            sb.append(", mImpCount=");
            sb.append(this.f151);
            sb.append(", mLashImpTime=");
            sb.append(this.f155);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final String m207() {
            return this.f156;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m208(int i) {
            this.f151 = i;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m209(String str) {
            this.f153 = str;
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final String m210() {
            return this.f152;
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final void m211(long j) {
            this.f155 = j;
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final void m212(String str) {
            this.f154 = str;
        }

        /* renamed from: ʻʼʽ, reason: contains not printable characters */
        public final long m213() {
            return this.f155;
        }

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public final int m214() {
            return this.f151;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final String m215() {
            return this.f154;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final void m216(String str) {
            this.f152 = str;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final String m217() {
            return this.f153;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final void m218(String str) {
            this.f156 = str;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImpRecord{mImpMap=");
        sb.append(this.f150);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final Map<String, List<C0068>> m205() {
        return this.f150;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m206(Map<String, List<C0068>> map) {
        this.f150 = map;
    }
}
