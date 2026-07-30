package com.baidu.platform.comapi.walknavi.g;

import com.baidu.mapapi.walknavi.model.RouteGuideKind;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f9989a = false;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final d f9990a = new c();
    }

    public static void b(boolean z7) {
        f9989a = z7;
    }

    public static d a() {
        return b.f9990a;
    }

    public static boolean b() {
        return f9989a;
    }

    private static class c implements d {
        private c() {
        }

        @Override // com.baidu.platform.comapi.walknavi.g.d
        public void a() {
            if (e.d().g()) {
                e.d().b(true);
                e.d().b("\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"walk\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 0\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\nparam._repeat_count = -1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onWalkPlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onWalkPlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n \nlocal onClickHandler = lua_handler:register_handle(\"onWalkClick\")\ncurrent_scene:set_event_handler(0, onClickHandler)\nfunction onWalkClick()\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_type\", \"click\")\n    mapData:put_string(\"name\", pod_name)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "walk");
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.d
        public void b() {
            e.d().o();
            e.d().a(false);
            e.d().b(false);
            e.d().a("\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"achieveGoal\"\n\npod_node:stop_action(id_play_music)\nid_play_music = pod_node:play_audio(\"res/media/stop.mp3\", -1, 0)\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncurrent_scene:set_event_handler(0, 0)\ncfg.forward_logic = 1\ncfg.backward_logic = 1\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\nparam._repeat_count = -1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onAchieveGoalPlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onAchieveGoalPlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"action_name\", \"achieveGoal\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "achieveGoal");
        }

        @Override // com.baidu.platform.comapi.walknavi.g.d
        public void c() {
            if (e.d().a("turnLeft")) {
                e.d().o();
                e.d().a(false);
                e.d().b("\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"turnRight\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 1\ncurrent_scene:set_event_handler(0, 0)\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\nparam._repeat_count = 1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onTurnRightPlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onTurnRightPlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"action_name\", \"turnRight\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "turnLeft");
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.d
        public void d() {
            if (e.d().a("helpless")) {
                e.d().o();
                e.d().a("\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"helpless\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 0\ncurrent_scene:set_event_handler(0, 0)\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\nparam._repeat_count = -1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onHelplessPlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onHelplessPlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"action_name\", \"helpless\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "helpless");
                boolean unused = g.f9989a = true;
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.d
        public void e() {
            if (e.d().a("turnAndCry")) {
                e.d().o();
                e.d().a("\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"turnAndCry\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 1\ncurrent_scene:set_event_handler(0, 0)\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\nparam._repeat_count = 1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onTurnAndCryPlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onTurnAndCryPlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"action_name\", \"turnAndCry\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "turnAndCry");
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.d
        public void f() {
            if (e.d().a("turnRight")) {
                e.d().o();
                e.d().a(false);
                e.d().b("\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"turnLeft\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 1\ncurrent_scene:set_event_handler(0, 0)\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\nparam._repeat_count = 1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onTurnLeftPlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onTurnLeftPlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"action_name\", \"turnLeft\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "turnRight");
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.d
        public void g() {
            if (e.d().g()) {
                e.d().b(true);
                e.d().b("\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"stopBreath\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 0\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\nparam._repeat_count = -1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onStopBreathPlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onStopBreathPlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n \nlocal onClickHandler = lua_handler:register_handle(\"onStopBreathClick\")\ncurrent_scene:set_event_handler(0, onClickHandler)\nfunction onStopBreathClick()\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_type\", \"click\")\n    mapData:put_string(\"name\", pod_name)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "stopBreath");
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.d
        public boolean a(RouteGuideKind routeGuideKind) {
            return routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Left_Back || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Left || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Left_Front || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Left_Front_Straight || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Left_PassRoad_Front || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Left_PassRoad_UTurn || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_LeftDiagonal_PassRoad_Right || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_LeftDiagonal_PassRoad_Right_Front || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_LeftDiagonal_PassRoad_Front || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_LeftDiagonal_PassRoad_Left_Front || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_LeftDiagonal_PassRoad_Left || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_LeftDiagonal_PassRoad_Left_Back || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_PassRoad_Left || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Goto_Left_Road || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Goto_Left_Road_UTurn;
        }

        @Override // com.baidu.platform.comapi.walknavi.g.d
        public boolean b(RouteGuideKind routeGuideKind) {
            return routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Right_Back || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Right || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Right_Front || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Right_Front_Straight || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Right_PassRoad_Front || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Right_PassRoad_UTurn || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_RightDiagonal_PassRoad_Left || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_RightDiagonal_PassRoad_Left_Front || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_RightDiagonal_PassRoad_Front || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_RightDiagonal_PassRoad_Right_Front || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_RightDiagonal_PassRoad_Right || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_RightDiagonal_PassRoad_Right_Back || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_PassRoad_Right || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Goto_Right_Road || routeGuideKind == RouteGuideKind.NE_Maneuver_Kind_Goto_Right_Road_UTurn;
        }
    }
}
