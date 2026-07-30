package com.baidu.platform.comapi.h.s;

import android.content.Context;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.MapLanguage;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected Context f9251a;

    /* renamed from: b, reason: collision with root package name */
    protected MapLanguage f9252b;

    public a(Context context, MapLanguage mapLanguage) {
        this.f9251a = context;
        this.f9252b = mapLanguage;
    }

    public int A() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_gps_weak_en : R.string.sdk_gps_weak;
    }

    public int B() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_location_en : R.string.sdk_location;
    }

    public int C() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_map_en : R.string.sdk_map;
    }

    public int D() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.wsdk_string_rg_nav_arrive_auto_exit_en : R.string.wsdk_string_rg_nav_arrive_auto_exit;
    }

    public int E() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_current_network_is_abnormal_please_try_again_later_en : R.string.sdk_current_network_is_abnormal_please_try_again_later;
    }

    public int F() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_next_page_en : R.string.sdk_next_page;
    }

    public int G() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_periphery_en : R.string.sdk_periphery;
    }

    public int H() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_quit_en : R.string.sdk_quit;
    }

    public int I() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_re_planning_the_route_en : R.string.sdk_re_planning_the_route;
    }

    public int J() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_remaining_distance_en : R.string.sdk_remaining_distance;
    }

    public int K() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_remaining_throughout_the_process_en : R.string.sdk_remaining_throughout_the_process;
    }

    public int L() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_remaining_time_en : R.string.sdk_remaining_time;
    }

    public int M() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.wsdk_string_rg_alert_setting_en : R.string.wsdk_string_rg_alert_setting;
    }

    public int N() {
        return this.f9252b == MapLanguage.ENGLISH ? R.drawable.icon_start_en : R.drawable.icon_start_walk;
    }

    public int O() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.wsdk_string_rg_sure_en : R.string.wsdk_string_rg_sure;
    }

    public int P() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_system_version_en : R.string.sdk_system_version;
    }

    public int Q() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_system_version_android_en : R.string.sdk_system_version_android;
    }

    public int R() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_system_version_ios_en : R.string.sdk_system_version_ios;
    }

    public int S() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.wsdk_string_rg_nav_title_tip_en : R.string.wsdk_string_rg_nav_title_tip;
    }

    public int T() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_top_speed_en : R.string.sdk_top_speed;
    }

    public int U() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.wsdk_string_rg_open_gps_en : R.string.wsdk_string_rg_open_gps;
    }

    public int V() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_view_overview_en : R.string.sdk_view_overview;
    }

    public int W() {
        return this.f9252b == MapLanguage.ENGLISH ? R.drawable.wsdk_drawable_rg_ic_north_walk_bike2d_en : R.drawable.wsdk_drawable_rg_ic_north_walk_bike2d;
    }

    public int X() {
        return this.f9252b == MapLanguage.ENGLISH ? R.drawable.wsdk_drawable_rg_ic_walk_bike3d_new_en : R.drawable.wsdk_drawable_rg_ic_walk_bike3d_new;
    }

    public int Y() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_weak_satellite_signal_en : R.string.sdk_weak_satellite_signal;
    }

    public int Z() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_yaw_planning_en : R.string.sdk_yaw_planning;
    }

    public int a() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_accumulated_climb_en : R.string.sdk_accumulated_climb;
    }

    public int a0() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_yaw_planning_success_en : R.string.sdk_yaw_planning_success;
    }

    public int b() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_after_en : R.string.sdk_after;
    }

    public int c() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_already_yaw_en : R.string.sdk_already_yaw;
    }

    public int d() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_android_so_en : R.string.sdk_android_so;
    }

    public int e() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_application_version_en : R.string.sdk_application_version;
    }

    public int f() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_application_version_android_en : R.string.sdk_application_version_android;
    }

    public int g() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_application_version_ios_en : R.string.sdk_application_version_ios;
    }

    public int h() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_average_velocity_en : R.string.sdk_average_velocity;
    }

    public int i() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.wsdk_string_rg_nav_dialog_cancel_en : R.string.wsdk_string_rg_nav_dialog_cancel;
    }

    public int j() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.wsdk_string_rg_nav_gps_exit_en : R.string.wsdk_string_rg_nav_gps_exit;
    }

    public int k() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_continue_cur_navigation_en : R.string.sdk_continue_cur_navigation;
    }

    public int l() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_current_altitude_en : R.string.sdk_current_altitude;
    }

    public int m() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_current_speed_en : R.string.sdk_current_speed;
    }

    public int n() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_currently_located_en : R.string.sdk_currently_located;
    }

    public int o() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_destination_en : R.string.sdk_destination;
    }

    public int p() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.wsdk_string_rg_faraway_en : R.string.wsdk_string_rg_faraway;
    }

    public int q() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_download_failed_please_try_again_later_en : R.string.sdk_download_failed_please_try_again_later;
    }

    public int r() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_equipment_requirements_en : R.string.sdk_equipment_requirements;
    }

    public int s() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_equipment_requirements_android_en : R.string.sdk_equipment_requirements_android;
    }

    public int t() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_equipment_requirements_ios_en : R.string.sdk_equipment_requirements_ios;
    }

    public int u() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_experience_now_en : R.string.sdk_experience_now;
    }

    public int v() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.wsdk_string_rg_no_gps_en : R.string.wsdk_string_rg_no_gps;
    }

    public int w() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_front_en : R.string.sdk_front;
    }

    public MapLanguage x() {
        return this.f9252b;
    }

    public int y() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.wsdk_string_rg_gps_not_open_and_set_en : R.string.wsdk_string_rg_gps_not_open_and_set;
    }

    public int z() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_gps_signal_weak_en : R.string.sdk_gps_signal_weak;
    }
}
