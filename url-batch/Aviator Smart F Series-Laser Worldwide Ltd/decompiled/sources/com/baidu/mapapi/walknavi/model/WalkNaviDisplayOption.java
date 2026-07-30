package com.baidu.mapapi.walknavi.model;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.View;

/* loaded from: classes2.dex */
public class WalkNaviDisplayOption implements com.baidu.mapapi.walknavi.adapter.a {

    /* renamed from: a, reason: collision with root package name */
    private Bitmap f7642a = null;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f7643b = null;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f7644c = null;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f7645d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7646e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7647f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7648g = false;

    /* renamed from: h, reason: collision with root package name */
    private int f7649h = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7650i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f7651j = 0;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7652k = false;

    /* renamed from: l, reason: collision with root package name */
    private int f7653l = 0;

    /* renamed from: m, reason: collision with root package name */
    private Typeface f7654m = null;

    /* renamed from: n, reason: collision with root package name */
    private boolean f7655n = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f7656o = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7657p = true;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7658q = true;

    /* renamed from: r, reason: collision with root package name */
    private boolean f7659r = true;

    /* renamed from: s, reason: collision with root package name */
    private boolean f7660s = true;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7661t = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7662u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7663v = true;

    /* renamed from: w, reason: collision with root package name */
    private View f7664w = null;

    /* renamed from: x, reason: collision with root package name */
    private int f7665x = 0;

    public int getBottomSettingLayout() {
        return this.f7653l;
    }

    public int getBottomViewHeight() {
        return this.f7665x;
    }

    public int getCalorieLayout() {
        return this.f7651j;
    }

    public boolean getCalorieLayoutEnable() {
        return this.f7656o;
    }

    public View getCustomBottomView() {
        return this.f7664w;
    }

    public Bitmap getImageArCloseIcon() {
        return this.f7644c;
    }

    public Bitmap getImageNPC() {
        return this.f7645d;
    }

    public Bitmap getImageToAR() {
        return this.f7642a;
    }

    public Bitmap getImageToNormal() {
        return this.f7643b;
    }

    public boolean getIsCustomWNaviCalorieLayout() {
        return this.f7650i;
    }

    public boolean getIsCustomWNaviGuideLayout() {
        return this.f7648g;
    }

    public boolean getIsCustomWNaviRgBarLayout() {
        return this.f7652k;
    }

    public boolean getIsShowBottomGuideLayout() {
        return this.f7659r;
    }

    public boolean getIsShowBottomSmallMapUI() {
        return this.f7660s;
    }

    public boolean getIsShowTopGuideLayout() {
        return this.f7658q;
    }

    public boolean getShowDialogEnable() {
        return this.f7662u;
    }

    public boolean getShowExitDialogEnable() {
        return this.f7663v;
    }

    public boolean getShowImageToAR() {
        return this.f7655n;
    }

    public boolean getShowImageToLocation() {
        return this.f7657p;
    }

    public int getTopGuideLayout() {
        return this.f7649h;
    }

    public Typeface getWNaviTextTypeface() {
        return this.f7654m;
    }

    public WalkNaviDisplayOption imageToAr(Bitmap bitmap) {
        this.f7642a = bitmap;
        return this;
    }

    public WalkNaviDisplayOption imageToNormal(Bitmap bitmap) {
        this.f7643b = bitmap;
        return this;
    }

    public boolean isAutoChaneNaviMode() {
        return this.f7661t;
    }

    public boolean isIsRunInFragment() {
        return this.f7647f;
    }

    public boolean isShowDialogWithExitNavi() {
        return this.f7646e;
    }

    public WalkNaviDisplayOption runInFragment(boolean z7) {
        this.f7647f = z7;
        return this;
    }

    public WalkNaviDisplayOption setArNaviResources(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        this.f7644c = bitmap;
        this.f7645d = bitmap2;
        this.f7643b = bitmap3;
        return this;
    }

    public WalkNaviDisplayOption setAutoChangeNaviMode(boolean z7) {
        this.f7661t = z7;
        return this;
    }

    public WalkNaviDisplayOption setBottomSettingLayout(int i8) {
        this.f7652k = true;
        this.f7653l = i8;
        return this;
    }

    public WalkNaviDisplayOption setCalorieLayout(int i8) {
        this.f7650i = true;
        this.f7651j = i8;
        return this;
    }

    public WalkNaviDisplayOption setCustomBottomView(View view) {
        this.f7664w = view;
        return this;
    }

    public WalkNaviDisplayOption setCustomBottomViewHeight(int i8) {
        if (i8 > 70) {
            this.f7665x = 70;
        } else {
            this.f7665x = i8;
        }
        return this;
    }

    public WalkNaviDisplayOption setNaviTextTypeface(Typeface typeface) {
        this.f7654m = typeface;
        return this;
    }

    public WalkNaviDisplayOption setTopGuideLayout(int i8) {
        this.f7648g = true;
        this.f7649h = i8;
        return this;
    }

    public WalkNaviDisplayOption showBottomGuideLayout(boolean z7) {
        this.f7659r = z7;
        return this;
    }

    public WalkNaviDisplayOption showBottomSmallMapUI(boolean z7) {
        this.f7660s = z7;
        return this;
    }

    public WalkNaviDisplayOption showCalorieLayoutEnable(boolean z7) {
        this.f7656o = z7;
        return this;
    }

    public WalkNaviDisplayOption showDialogEnable(boolean z7) {
        this.f7662u = z7;
        return this;
    }

    public WalkNaviDisplayOption showDialogWithExitNavi(boolean z7) {
        this.f7646e = z7;
        return this;
    }

    public WalkNaviDisplayOption showExitDialogEnable(boolean z7) {
        this.f7663v = z7;
        return this;
    }

    public WalkNaviDisplayOption showImageToAr(boolean z7) {
        this.f7655n = z7;
        return this;
    }

    public WalkNaviDisplayOption showLocationImage(boolean z7) {
        this.f7657p = z7;
        return this;
    }

    public WalkNaviDisplayOption showTopGuideLayout(boolean z7) {
        this.f7658q = z7;
        return this;
    }
}
