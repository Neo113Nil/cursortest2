package com.baidu.platform.comapi.b.c;

import android.text.TextUtils;
import com.baidu.baidumapsdk_api.R;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f8742a = {R.drawable.bn_dest_blue, R.drawable.bn_faraway_route_blue, R.drawable.bn_gps_blue, R.drawable.bn_ladder_blue, R.drawable.bn_overline_bridge_blue, R.drawable.bn_park_blue, R.drawable.bn_reroute_blue, R.drawable.bn_ring_blue, R.drawable.bn_square_blue, R.drawable.bn_start_blue, R.drawable.bn_turn_front_blue, R.drawable.bn_turn_goto_leftroad_front_blue, R.drawable.bn_turn_goto_leftroad_uturn_blue, R.drawable.bn_turn_goto_rightroad_front_blue, R.drawable.bn_turn_goto_rightroad_uturn_blue, R.drawable.bn_turn_left_blue, R.drawable.bn_turn_left_back_blue, R.drawable.bn_turn_left_diagonal_passroad_front_blue, R.drawable.bn_turn_left_diagonal_passroad_left_blue, R.drawable.bn_turn_left_diagonal_passroad_left_back_blue, R.drawable.bn_turn_left_diagonal_passroad_left_front_blue, R.drawable.bn_turn_left_diagonal_passroad_right_blue, R.drawable.bn_turn_left_diagonal_passroad_right_front_blue, R.drawable.bn_turn_left_front_blue, R.drawable.bn_turn_left_front_straight_blue, R.drawable.bn_turn_left_passroad_front_blue, R.drawable.bn_turn_left_passroad_uturn_blue, R.drawable.bn_turn_passroad_left_blue, R.drawable.bn_turn_passroad_right_blue, R.drawable.bn_turn_right_blue, R.drawable.bn_turn_right_back_blue, R.drawable.bn_turn_right_diagonal_passroad_front_blue, R.drawable.bn_turn_right_diagonal_passroad_left_blue, R.drawable.bn_turn_right_diagonal_passroad_left_front_blue, R.drawable.bn_turn_right_diagonal_passroad_right_blue, R.drawable.bn_turn_right_diagonal_passroad_right_back_blue, R.drawable.bn_turn_right_diagonal_passroad_right_front_blue, R.drawable.bn_turn_right_front_blue, R.drawable.bn_turn_right_front_straight_blue, R.drawable.bn_turn_right_passroad_front_blue, R.drawable.bn_turn_right_passroad_uturn_blue, R.drawable.bn_underground_passage_blue, R.drawable.bn_uturn_blue, R.drawable.bn_waypoint_blue, R.drawable.bn_turn_left_3branch_left, R.drawable.bn_turn_left_3branch_mid, R.drawable.bn_turn_left_3branch_right, R.drawable.bn_turn_left_2branch_left, R.drawable.bn_turn_left_2branch_right, R.drawable.bn_turn_right_3branch_left, R.drawable.bn_turn_right_3branch_mid, R.drawable.bn_turn_right_3branch_right, R.drawable.bn_turn_right_2branch_left, R.drawable.bn_turn_right_2branch_right, R.drawable.bn_turn_front_3branch_left, R.drawable.bn_turn_front_3branch_center, R.drawable.bn_turn_front_3branch_right, R.drawable.bn_turn_front_2branch_left, R.drawable.bn_turn_front_2branch_right};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f8743b = {"bn_dest.png", "bn_faraway_route", "bn_gps.png", "bn_ladder.png", "bn_overline_bridge.png", "bn_park.png", "bn_reroute.png", "bn_ring.png", "bn_square.png", "bn_start.png", "bn_turn_front.png", "bn_turn_goto_leftroad_front.png", "bn_turn_goto_leftroad_uturn.png", "bn_turn_goto_rightroad_front.png", "bn_turn_goto_rightroad_uturn.png", "bn_turn_left.png", "bn_turn_left_back.png", "bn_turn_left_diagonal_passroad_front.png", "bn_turn_left_diagonal_passroad_left.png", "bn_turn_left_diagonal_passroad_left_back.png", "bn_turn_left_diagonal_passroad_left_front.png", "bn_turn_left_diagonal_passroad_right.png", "bn_turn_left_diagonal_passroad_right_front.png", "bn_turn_left_front.png", "bn_turn_left_front_straight.png", "bn_turn_left_passroad_front.png", "bn_turn_left_passroad_uturn.png", "bn_turn_passroad_left.png", "bn_turn_passroad_right.png", "bn_turn_right.png", "bn_turn_right_back.png", "bn_turn_right_diagonal_passroad_front.png", "bn_turn_right_diagonal_passroad_left.png", "bn_turn_right_diagonal_passroad_left_front.png", "bn_turn_right_diagonal_passroad_right.png", "bn_turn_right_diagonal_passroad_right_back.png", "bn_turn_right_diagonal_passroad_right_front.png", "bn_turn_right_front.png", "bn_turn_right_front_straight.png", "bn_turn_right_passroad_front.png", "bn_turn_right_passroad_uturn.png", "bn_underground_passage.png", "bn_uturn.png", "wn_waypoint.png", "bn_turn_left_3branch_left.png", "bn_turn_left_3branch_mid.png", "bn_turn_left_3branch_right.png", "bn_turn_left_2branch_left.png", "bn_turn_left_2branch_right.png", "bn_turn_right_3branch_left.png", "bn_turn_right_3branch_mid.png", "bn_turn_right_3branch_right.png", "bn_turn_right_2branch_left.png", "bn_turn_right_2branch_right.png", "bn_turn_front_3branch_left.png", "bn_turn_front_3branch_center.png", "bn_turn_front_3branch_right.png", "bn_turn_front_2branch_left.png", "bn_turn_front_2branch_right.png"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f8744c = {"bsdk_drawable_rg_ic_dest.png", "bsdk_drawable_rg_ic_faraway_route.png", "bsdk_drawable_rg_ic_gps.png", "bsdk_drawable_rg_ic_ladder.png", "bsdk_drawable_rg_ic_overline_bridge.png", "bsdk_drawable_rg_ic_park.png", "bsdk_drawable_rg_ic_reroute.png", "bsdk_drawable_rg_ic_ring.png", "bsdk_drawable_rg_ic_square.png", "bsdk_drawable_rg_ic_start.png", "bsdk_drawable_rg_ic_turn_front.png", "bsdk_drawable_rg_ic_turn_goto_leftroad_front.png", "bsdk_drawable_rg_ic_turn_goto_leftroad_uturn.png", "bsdk_drawable_rg_ic_turn_goto_rightroad_front.png", "bsdk_drawable_rg_ic_turn_goto_rightroad_uturn.png", "bsdk_drawable_rg_ic_turn_left.png", "bsdk_drawable_rg_ic_turn_left_back.png", "bsdk_drawable_rg_ic_turn_left_diagonal_passroad_front.png", "bsdk_drawable_rg_ic_turn_left_diagonal_passroad_left.png", "bsdk_drawable_rg_ic_turn_left_diagonal_passroad_left_back.png", "bsdk_drawable_rg_ic_turn_left_diagonal_passroad_left_front.png", "bsdk_drawable_rg_ic_turn_left_diagonal_passroad_right.png", "bsdk_drawable_rg_ic_turn_left_diagonal_passroad_right_front.png", "bsdk_drawable_rg_ic_turn_left_front.png", "bsdk_drawable_rg_ic_turn_left_front_straight.png", "bsdk_drawable_rg_ic_turn_left_passroad_front.png", "bsdk_drawable_rg_ic_turn_left_passroad_uturn.png", "bsdk_drawable_rg_ic_turn_passroad_left.png", "bsdk_drawable_rg_ic_turn_passroad_right.png", "bsdk_drawable_rg_ic_turn_right.png", "bsdk_drawable_rg_ic_turn_right_back.png", "bsdk_drawable_rg_ic_turn_right_diagonal_passroad_front.png", "bsdk_drawable_rg_ic_turn_right_diagonal_passroad_left.png", "bsdk_drawable_rg_ic_turn_right_diagonal_passroad_left_front.png", "bsdk_drawable_rg_ic_turn_right_diagonal_passroad_right.png", "bsdk_drawable_rg_ic_turn_right_diagonal_passroad_right_back.png", "bsdk_drawable_rg_ic_turn_right_diagonal_passroad_right_front.png", "bsdk_drawable_rg_ic_turn_right_front.png", "bsdk_drawable_rg_ic_turn_right_front_straight.png", "bsdk_drawable_rg_ic_turn_right_passroad_front.png", "bsdk_drawable_rg_ic_turn_right_passroad_uturn.png", "bsdk_drawable_rg_ic_underground_passage.png", "bsdk_drawable_rg_ic_uturn.png", "bsdk_drawable_rg_ic_waypoint.png", "bsdk_drawable_rg_ic_turn_left_3branch_left.png", "bsdk_drawable_rg_ic_turn_left_3branch_mid.png", "bsdk_drawable_rg_ic_turn_left_3branch_right.png", "bsdk_drawable_rg_ic_turn_left_2branch_left.png", "bsdk_drawable_rg_ic_turn_left_2branch_right.png", "bsdk_drawable_rg_ic_turn_right_3branch_left.png", "bsdk_drawable_rg_ic_turn_right_3branch_mid.png", "bsdk_drawable_rg_ic_turn_right_3branch_right.png", "bsdk_drawable_rg_ic_turn_right_2branch_left.png", "bsdk_drawable_rg_ic_turn_right_2branch_right.png", "bsdk_drawable_rg_ic_turn_front_3branch_left.png", "bsdk_drawable_rg_ic_turn_front_3branch_center.png", "bsdk_drawable_rg_ic_turn_front_3branch_right.png", "bsdk_drawable_rg_ic_turn_front_2branch_left.png", "bsdk_drawable_rg_ic_turn_front_2branch_right.png"};

    public static int a(String str) {
        int i8 = R.drawable.bn_start_blue;
        if (!TextUtils.isEmpty(str)) {
            int length = f8743b.length;
            for (int i9 = 0; i9 < length; i9++) {
                if (f8743b[i9].equalsIgnoreCase(str)) {
                    return f8742a[i9];
                }
            }
        }
        return i8;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "start.png";
        }
        int length = f8743b.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (f8743b[i8].equalsIgnoreCase(str)) {
                return f8744c[i8];
            }
        }
        return "start.png";
    }
}
