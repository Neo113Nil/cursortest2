package com.baidu.platform.comapi.walknavi.k.e;

import android.text.TextUtils;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.walknavi.model.RouteGuideKind;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10197a = {R.drawable.wn_dest, R.drawable.wn_faraway_route, R.drawable.wn_gps, R.drawable.wn_ladder, R.drawable.wn_overline_bridge, R.drawable.wn_park, R.drawable.wn_reroute, R.drawable.wn_ring, R.drawable.wn_square, R.drawable.wn_start, R.drawable.wn_turn_front, R.drawable.wn_turn_goto_leftroad_front, R.drawable.wn_turn_goto_leftroad_uturn, R.drawable.wn_turn_goto_rightroad_front, R.drawable.wn_turn_goto_rightroad_uturn, R.drawable.wn_turn_left, R.drawable.wn_turn_left_back, R.drawable.wn_turn_left_diagonal_passroad_front, R.drawable.wn_turn_left_diagonal_passroad_left, R.drawable.wn_turn_left_diagonal_passroad_left_back, R.drawable.wn_turn_left_diagonal_passroad_left_front, R.drawable.wn_turn_left_diagonal_passroad_right, R.drawable.wn_turn_left_diagonal_passroad_right_front, R.drawable.wn_turn_left_front, R.drawable.wn_turn_left_front_straight, R.drawable.wn_turn_left_passroad_front, R.drawable.wn_turn_left_passroad_uturn, R.drawable.wn_turn_passroad_left, R.drawable.wn_turn_passroad_right, R.drawable.wn_turn_right, R.drawable.wn_turn_right_back, R.drawable.wn_turn_right_diagonal_passroad_front, R.drawable.wn_turn_right_diagonal_passroad_left, R.drawable.wn_turn_right_diagonal_passroad_left_front, R.drawable.wn_turn_right_diagonal_passroad_right, R.drawable.wn_turn_right_diagonal_passroad_right_back, R.drawable.wn_turn_right_diagonal_passroad_right_front, R.drawable.wn_turn_right_front, R.drawable.wn_turn_right_front_straight, R.drawable.wn_turn_right_passroad_front, R.drawable.wn_turn_right_passroad_uturn, R.drawable.wn_underground_passage, R.drawable.wn_uturn, R.drawable.wn_waypoint, R.drawable.wn_left_three_left_side, R.drawable.wn_left_three_middle, R.drawable.wn_left_three_right_side, R.drawable.wn_left_two_left_side, R.drawable.wn_left_two_right_side, R.drawable.wn_right_three_left_side, R.drawable.wn_right_three_middle, R.drawable.wn_right_three_right_side, R.drawable.wn_right_two_left_side, R.drawable.wn_right_two_right_side, R.drawable.wn_three_left_side, R.drawable.wn_three_middle, R.drawable.wn_three_right_side, R.drawable.wn_two_left_side, R.drawable.wn_two_right_side, R.drawable.wn_ship, R.drawable.wn_door, R.drawable.wn_elevator, R.drawable.wn_stair, R.drawable.wn_escalator, R.drawable.wn_securitycheck, R.drawable.wn_indoor_bianjie, R.drawable.wn_out_overline_bridge, R.drawable.wn_pass_overline_bridge, R.drawable.wn_pass_underground_passege, R.drawable.wn_out_underground_passege, R.drawable.wn_indoor_walk_gray, R.drawable.wn_subway_gray};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f10198b = {R.drawable.wn_dest_blue, R.drawable.wn_faraway_route_blue, R.drawable.wn_gps_blue, R.drawable.wn_ladder_blue, R.drawable.wn_overline_bridge_blue, R.drawable.wn_park_blue, R.drawable.wn_reroute_blue, R.drawable.wn_ring_blue, R.drawable.wn_square_blue, R.drawable.wn_start_blue, R.drawable.wn_turn_front_blue, R.drawable.wn_turn_goto_leftroad_front_blue, R.drawable.wn_turn_goto_leftroad_uturn_blue, R.drawable.wn_turn_goto_rightroad_front_blue, R.drawable.wn_turn_goto_rightroad_uturn_blue, R.drawable.wn_turn_left_blue, R.drawable.wn_turn_left_back_blue, R.drawable.wn_turn_left_diagonal_passroad_front_blue, R.drawable.wn_turn_left_diagonal_passroad_left_blue, R.drawable.wn_turn_left_diagonal_passroad_left_back_blue, R.drawable.wn_turn_left_diagonal_passroad_left_front_blue, R.drawable.wn_turn_left_diagonal_passroad_right_blue, R.drawable.wn_turn_left_diagonal_passroad_right_front_blue, R.drawable.wn_turn_left_front_blue, R.drawable.wn_turn_left_front_straight_blue, R.drawable.wn_turn_left_passroad_front_blue, R.drawable.wn_turn_left_passroad_uturn_blue, R.drawable.wn_turn_passroad_left_blue, R.drawable.wn_turn_passroad_right_blue, R.drawable.wn_turn_right_blue, R.drawable.wn_turn_right_back_blue, R.drawable.wn_turn_right_diagonal_passroad_front_blue, R.drawable.wn_turn_right_diagonal_passroad_left_blue, R.drawable.wn_turn_right_diagonal_passroad_left_front_blue, R.drawable.wn_turn_right_diagonal_passroad_right_blue, R.drawable.wn_turn_right_diagonal_passroad_right_back_blue, R.drawable.wn_turn_right_diagonal_passroad_right_front_blue, R.drawable.wn_turn_right_front_blue, R.drawable.wn_turn_right_front_straight_blue, R.drawable.wn_turn_right_passroad_front_blue, R.drawable.wn_turn_right_passroad_uturn_blue, R.drawable.wn_underground_passage_blue, R.drawable.wn_uturn_blue, R.drawable.wn_waypoint_blue, R.drawable.wn_ship_blue, R.drawable.wn_door_blue, R.drawable.wn_elevator_blue, R.drawable.wn_stair_blue, R.drawable.wn_escalator_blue, R.drawable.wn_securitycheck_blue};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f10199c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f10200d;

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f10201e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10202a;

        static {
            int[] iArr = new int[RouteGuideKind.values().length];
            f10202a = iArr;
            try {
                iArr[RouteGuideKind.NE_Maneuver_Kind_OverlineBridge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10202a[RouteGuideKind.NE_Maneuver_Kind_UndergroundPassage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10202a[RouteGuideKind.NE_Maneuver_Kind_Park.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10202a[RouteGuideKind.NE_Maneuver_Kind_Square.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10202a[RouteGuideKind.NE_Maneuver_Kind_Ladder.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10202a[RouteGuideKind.NE_Maneuver_Kind_Ferry.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10202a[RouteGuideKind.NE_Maneuver_Kind_Bridge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10202a[RouteGuideKind.NE_Maneuver_Kind_Ring.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10202a[RouteGuideKind.NE_Maneuver_Kind_SideWalk.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10202a[RouteGuideKind.NE_Maneuver_Kind_Sightseeing_Bus.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10202a[RouteGuideKind.NE_Maneuver_Kind_Telpher.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        int i8 = R.drawable.wn_right_three_right_side_white;
        f10199c = new int[]{R.drawable.wn_dest_white, R.drawable.wn_faraway_route_white, R.drawable.wn_gps_white, R.drawable.wn_ladder_white, R.drawable.wn_overline_bridge_white, R.drawable.wn_park_white, R.drawable.wn_reroute_white, R.drawable.wn_ring_white, R.drawable.wn_square_white, R.drawable.wn_start_white, R.drawable.wn_turn_front_white, R.drawable.wn_turn_goto_leftroad_front_white, R.drawable.wn_turn_goto_leftroad_uturn_white, R.drawable.wn_turn_goto_rightroad_front_white, R.drawable.wn_turn_goto_rightroad_uturn_white, R.drawable.wn_turn_left_white, R.drawable.wn_turn_left_back_white, R.drawable.wn_turn_left_diagonal_passroad_front_white, R.drawable.wn_turn_left_diagonal_passroad_left_white, R.drawable.wn_turn_left_diagonal_passroad_left_back_white, R.drawable.wn_turn_left_diagonal_passroad_left_front_white, R.drawable.wn_turn_left_diagonal_passroad_right_white, R.drawable.wn_turn_left_diagonal_passroad_right_front_white, R.drawable.wn_turn_left_front_white, R.drawable.wn_turn_left_front_straight_white, R.drawable.wn_turn_left_passroad_front_white, R.drawable.wn_turn_left_passroad_uturn_white, R.drawable.wn_turn_passroad_left_white, R.drawable.wn_turn_passroad_right_white, R.drawable.wn_turn_right_white, R.drawable.wn_turn_right_back_white, R.drawable.wn_turn_right_diagonal_passroad_front_white, R.drawable.wn_turn_right_diagonal_passroad_left_white, R.drawable.wn_turn_right_diagonal_passroad_left_front_white, R.drawable.wn_turn_right_diagonal_passroad_right_white, R.drawable.wn_turn_right_diagonal_passroad_right_back_white, R.drawable.wn_turn_right_diagonal_passroad_right_front_white, R.drawable.wn_turn_right_front_white, R.drawable.wn_turn_right_front_straight_white, R.drawable.wn_turn_right_passroad_front_white, R.drawable.wn_turn_right_passroad_uturn_white, R.drawable.wn_underground_passage_white, R.drawable.wn_uturn_white, R.drawable.wn_waypoint_white, R.drawable.wn_left_three_left_side_white, R.drawable.wn_left_three_middle_white, R.drawable.wn_left_three_right_side_white, R.drawable.wn_left_two_left_side_white, R.drawable.wn_left_two_right_side_white, R.drawable.wn_right_three_left_side_white, R.drawable.wn_right_three_middle_white, i8, R.drawable.wn_right_two_left_side_white, i8, R.drawable.wn_three_left_side_white, R.drawable.wn_three_middle_white, R.drawable.wn_three_right_side_white, R.drawable.wn_two_left_side_white, R.drawable.wn_two_right_side_white, R.drawable.wn_ship_white, R.drawable.wn_door_white, R.drawable.wn_elevator_white, R.drawable.wn_stair_white, R.drawable.wn_escalator_white, R.drawable.wn_securitycheck_white, R.drawable.wn_indoor_bianjie_white, R.drawable.wn_out_overline_bridge_white, R.drawable.wn_pass_overline_bridge_white, R.drawable.wn_pass_underground_passege_white, R.drawable.wn_out_underground_passege_white, R.drawable.wn_indoor_walk, R.drawable.wn_subway};
        f10200d = new String[]{"wn_dest.png", "wn_faraway_route", "wn_gps.png", "wn_ladder.png", "wn_overline_bridge.png", "wn_park.png", "wn_reroute.png", "wn_ring.png", "wn_square.png", "wn_start.png", "wn_turn_front.png", "wn_turn_goto_leftroad_front.png", "wn_turn_goto_leftroad_uturn.png", "wn_turn_goto_rightroad_front.png", "wn_turn_goto_rightroad_uturn.png", "wn_turn_left.png", "wn_turn_left_back.png", "wn_turn_left_diagonal_passroad_front.png", "wn_turn_left_diagonal_passroad_left.png", "wn_turn_left_diagonal_passroad_left_back.png", "wn_turn_left_diagonal_passroad_left_front.png", "wn_turn_left_diagonal_passroad_right.png", "wn_turn_left_diagonal_passroad_right_front.png", "wn_turn_left_front.png", "wn_turn_left_front_straight.png", "wn_turn_left_passroad_front.png", "wn_turn_left_passroad_uturn.png", "wn_turn_passroad_left.png", "wn_turn_passroad_right.png", "wn_turn_right.png", "wn_turn_right_back.png", "wn_turn_right_diagonal_passroad_front.png", "wn_turn_right_diagonal_passroad_left.png", "wn_turn_right_diagonal_passroad_left_front.png", "wn_turn_right_diagonal_passroad_right.png", "wn_turn_right_diagonal_passroad_right_back.png", "wn_turn_right_diagonal_passroad_right_front.png", "wn_turn_right_front.png", "wn_turn_right_front_straight.png", "wn_turn_right_passroad_front.png", "wn_turn_right_passroad_uturn.png", "wn_underground_passage.png", "wn_uturn.png", "wn_waypoint.png", "wn_turn_left_3branch_left.png", "wn_turn_left_3branch_mid.png", "wn_turn_left_3branch_right.png", "wn_turn_left_2branch_left.png", "wn_turn_left_2branch_right.png", "wn_turn_right_3branch_left.png", "wn_turn_right_3branch_mid.png", "wn_turn_right_3branch_right.png", "wn_turn_right_2branch_left.png", "wn_turn_right_2branch_right.png", "wn_turn_front_3branch_left.png", "wn_turn_front_3branch_center.png", "wn_turn_front_3branch_right.png", "wn_turn_front_2branch_left.png", "wn_turn_front_2branch_right.png", "wn_ship.png", "wn_door.png", "wn_elevator.png", "wn_stair.png", "wn_escalator.png", "wn_security_check.png", "wn_indoor_bianjie.png", "wn_out_overline_bridge.png", "wn_pass_overline_bridge.png", "wn_pass_underground_passege.png", "wn_out_underground_passege.png", "wn_indoor_walk.png", "wn_subway.png"};
        f10201e = new String[]{"wsdk_drawable_rg_ic_dest.png", "wsdk_drawable_rg_ic_faraway_route.png", "wsdk_drawable_rg_ic_gps.png", "wsdk_drawable_rg_ic_ladder.png", "wsdk_drawable_rg_ic_overline_bridge.png", "wsdk_drawable_rg_ic_park.png", "wsdk_drawable_rg_ic_reroute.png", "wsdk_drawable_rg_ic_ring.png", "wsdk_drawable_rg_ic_square.png", "wsdk_drawable_rg_ic_start.png", "wsdk_drawable_rg_ic_turn_front.png", "wsdk_drawable_rg_ic_turn_goto_leftroad_front.png", "wsdk_drawable_rg_ic_turn_goto_leftroad_uturn.png", "wsdk_drawable_rg_ic_turn_goto_rightroad_front.png", "wsdk_drawable_rg_ic_turn_goto_rightroad_uturn.png", "wsdk_drawable_rg_ic_turn_left.png", "wsdk_drawable_rg_ic_turn_left_back.png", "wsdk_drawable_rg_ic_turn_left_diagonal_passroad_front.png", "wsdk_drawable_rg_ic_turn_left_diagonal_passroad_left.png", "wsdk_drawable_rg_ic_turn_left_diagonal_passroad_left_back.png", "wsdk_drawable_rg_ic_turn_left_diagonal_passroad_left_front.png", "wsdk_drawable_rg_ic_turn_left_diagonal_passroad_right.png", "wsdk_drawable_rg_ic_turn_left_diagonal_passroad_right_front.png", "wsdk_drawable_rg_ic_turn_left_front.png", "wsdk_drawable_rg_ic_turn_left_front_straight.png", "wsdk_drawable_rg_ic_turn_left_passroad_front.png", "wsdk_drawable_rg_ic_turn_left_passroad_uturn.png", "wsdk_drawable_rg_ic_turn_passroad_left.png", "wsdk_drawable_rg_ic_turn_passroad_right.png", "wsdk_drawable_rg_ic_turn_right.png", "wsdk_drawable_rg_ic_turn_right_back.png", "wsdk_drawable_rg_ic_turn_right_diagonal_passroad_front.png", "wsdk_drawable_rg_ic_turn_right_diagonal_passroad_left.png", "wsdk_drawable_rg_ic_turn_right_diagonal_passroad_left_front.png", "wsdk_drawable_rg_ic_turn_right_diagonal_passroad_right.png", "wsdk_drawable_rg_ic_turn_right_diagonal_passroad_right_back.png", "wsdk_drawable_rg_ic_turn_right_diagonal_passroad_right_front.png", "wsdk_drawable_rg_ic_turn_right_front.png", "wsdk_drawable_rg_ic_turn_right_front_straight.png", "wsdk_drawable_rg_ic_turn_right_passroad_front.png", "wsdk_drawable_rg_ic_turn_right_passroad_uturn.png", "wsdk_drawable_rg_ic_underground_passage.png", "wsdk_drawable_rg_ic_uturn.png", "wsdk_drawable_rg_ic_waypoint.png", "wsdk_drawable_rg_ic_left_three_left_side.png", "wsdk_drawable_rg_ic_left_three_middle.png", "wsdk_drawable_rg_ic_left_three_right_side.png", "wsdk_drawable_rg_ic_left_two_left_side.png", "wsdk_drawable_rg_ic_left_two_right_side.png", "wsdk_drawable_rg_ic_right_three_left_side.png", "wsdk_drawable_rg_ic_right_three_middle.png", "wsdk_drawable_rg_ic_right_three_right_side.png", "wsdk_drawable_rg_ic_right_two_left_side.png", "wsdk_drawable_rg_ic_right_two_right_side.png", "wsdk_drawable_rg_ic_three_left_side.png", "wsdk_drawable_rg_ic_three_middle.png", "wsdk_drawable_rg_ic_three_right_side.png", "wsdk_drawable_rg_ic_two_left_side.png", "wsdk_drawable_rg_ic_two_right_side.png", "wsdk_drawable_rg_ic_ship.png", "wsdk_drawable_rg_ic_door.png", "wsdk_drawable_rg_ic_elevator.png", "wsdk_drawable_rg_ic_stair.png", "wsdk_drawable_rg_ic_escalator.png", "wsdk_drawable_rg_ic_securitycheck.png", "wsdk_drawable_rg_ic_indoor_bianjie.png", "wsdk_drawable_rg_ic_out_overline_bridge.png", "wsdk_drawable_rg_ic_pass_overline_bridge.png", "wsdk_drawable_rg_ic_pass_underground_passege.png", "wsdk_drawable_rg_ic_out_underground_passege.png", "wsdk_drawable_rg_ic_indoor_walk.png", "wsdk_drawable_rg_ic_subway.png"};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] a(RouteGuideKind routeGuideKind) {
        int[] iArr = new int[2];
        switch (a.f10202a[routeGuideKind.ordinal()]) {
            case 1:
                iArr[0] = R.drawable.wsdk_walk_type_1_up;
                iArr[1] = R.drawable.wsdk_walk_type_1_down;
                break;
            case 2:
                iArr[0] = R.drawable.wsdk_walk_type_2_up;
                iArr[1] = R.drawable.wsdk_walk_type_2_down;
                break;
            case 3:
                iArr[0] = R.drawable.wsdk_walk_type_3_up;
                iArr[1] = R.drawable.wsdk_walk_type_3_down;
                break;
            case 4:
                iArr[0] = R.drawable.wsdk_walk_type_4_up;
                iArr[1] = R.drawable.wsdk_walk_type_4_down;
                break;
            case 5:
                iArr[0] = R.drawable.wsdk_walk_type_5_up;
                iArr[1] = R.drawable.wsdk_walk_type_5_down;
                break;
            case 6:
                iArr[0] = R.drawable.wsdk_walk_type_6_up;
                iArr[1] = R.drawable.wsdk_walk_type_6_down;
                break;
            case 7:
                iArr[0] = R.drawable.wsdk_walk_type_8_up;
                iArr[1] = R.drawable.wsdk_walk_type_8_down;
                break;
            case 8:
                iArr[0] = R.drawable.wsdk_walk_type_9_up;
                iArr[1] = R.drawable.wsdk_walk_type_9_down;
                break;
            case 9:
                iArr[0] = R.drawable.wsdk_walk_type_10_up;
                iArr[1] = R.drawable.wsdk_walk_type_10_down;
                break;
            case 10:
                iArr[0] = R.drawable.wsdk_walk_type_13_up;
                iArr[1] = R.drawable.wsdk_walk_type_13_down;
                break;
            case 11:
                iArr[0] = R.drawable.wsdk_walk_type_14_up;
                iArr[1] = R.drawable.wsdk_walk_type_14_down;
                break;
        }
    }

    public static int b(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = f10200d.length;
            for (int i8 = 0; i8 < length; i8++) {
                if (f10200d[i8].equalsIgnoreCase(str)) {
                    int[] iArr = f10197a;
                    if (i8 < iArr.length) {
                        return iArr[i8];
                    }
                }
            }
        }
        return 0;
    }

    public static int c(String str) {
        int i8 = R.drawable.wn_start_white;
        if (!TextUtils.isEmpty(str)) {
            int length = f10200d.length;
            for (int i9 = 0; i9 < length; i9++) {
                if (f10200d[i9].equalsIgnoreCase(str)) {
                    return f10199c[i9];
                }
            }
        }
        return i8;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "start.png";
        }
        int length = f10200d.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (f10200d[i8].equalsIgnoreCase(str)) {
                return f10201e[i8];
            }
        }
        return "start.png";
    }
}
